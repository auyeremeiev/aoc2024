package aoc2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day4 {
    private static final String TASK_4_1_WORD = "XMAS";
    private static final String TASK_4_2_WORD = "MAS";

    public long countForTask1(String input) {
        List<List<Character>> inputMatrix = readInput(input);
        int wordLength = TASK_4_1_WORD.length();

        if (inputMatrix.get(0).size() < wordLength) {
            // do only vertical hashing
        } else if (inputMatrix.size() < wordLength) {
            // do only horizontal hashing
        }

        // getHash(TASK_4_1_WORD) = 2697703
        // getHash(reverse(TASK_4_1_WORD)) = 2537593
        List<List<Integer>> horizontalHashMatrix = generateHorizontalHashMatrix(inputMatrix, wordLength);
        List<List<Integer>> verticalHashMatrix = generateVerticalHashMatrix(inputMatrix, wordLength);
        List<List<Integer>> diagonalHashMatrix = generateDiagonalHashMatrix(inputMatrix, wordLength);
        List<List<Integer>> reverseDiagonalHashMatrix = generateReverseDiagonalHashMatrix(inputMatrix, wordLength);

        return countMatches(horizontalHashMatrix, diagonalHashMatrix, verticalHashMatrix, reverseDiagonalHashMatrix, TASK_4_1_WORD);
    }

    public long countForTask2(String input) {
        List<List<Character>> inputMatrix = readInput(input);
        int wordLength = TASK_4_2_WORD.length();

        // getHash(TASK_4_2_WORD) = 76096
        // getHash(reverse(TASK_4_2_WORD)) = 81855
        List<List<Integer>> diagonalHashMatrix = generateDiagonalHashMatrix(inputMatrix, wordLength);
        List<List<Integer>> reverseDiagonalHashMatrix = generateReverseDiagonalHashMatrix(inputMatrix, wordLength);

        return countMatchesTask2(diagonalHashMatrix, reverseDiagonalHashMatrix, TASK_4_2_WORD);
    }

    private List<List<Integer>> generateHorizontalHashMatrix(List<List<Character>> inputMatrix, int wordLength) {
        int numberOfRows = inputMatrix.size();
        int numberOfColumns = inputMatrix.get(0).size();
        List<List<Integer>> horizontalHashMatrix = createMatrix(numberOfRows, numberOfColumns);

        for (int i = 0; i < numberOfRows; i++) {
            List<Character> line = inputMatrix.get(i);

            int currentHash = getHash(line, 0, wordLength);
            horizontalHashMatrix.get(i).set(0, currentHash);
            for (int j = 1; j < numberOfColumns - wordLength + 1; j++) {
                currentHash = slideHash(currentHash, line, /* currentHashPosition */ j - 1, wordLength);
                horizontalHashMatrix.get(i).set(j, currentHash);
            }
        }
        return horizontalHashMatrix;
    }

    private int slideHash(int currentHash, List<Character> line, int currentIndex, int wordLength) {
        Character firstCharacter = line.get(currentIndex);
        int result = currentHash;
        result -= firstCharacter.hashCode() * Math.pow(31, wordLength - 1); // we deduct first char
        return result * 31 + line.get(currentIndex + wordLength);
    }

    private List<List<Integer>> generateVerticalHashMatrix(List<List<Character>> inputMatrix, int wordLength) {
        int numberOfRows = inputMatrix.size();
        int numberOfColumns = inputMatrix.get(0).size();

        List<List<Integer>> verticalHashMatrix = createMatrix(numberOfRows, numberOfColumns);
        for (int column = 0; column < numberOfColumns; column++) {
            int currentVerticalHash = getHashVertical(inputMatrix, 0, wordLength, column);
            verticalHashMatrix.get(0).set(column, currentVerticalHash);

            // 0 1 2 3 4 -> 5 - 4 = 1 -> 0] 1 2 3 4
            for (int row = 1; row < numberOfRows - wordLength + 1; row++) {
                currentVerticalHash = slideHashVertical(
                        currentVerticalHash, inputMatrix, /* currentHashPosition */
                        row - 1, wordLength, column
                );
                verticalHashMatrix.get(row).set(column, currentVerticalHash);
            }
        }
        return verticalHashMatrix;
    }

    // fuck me
    private List<List<Integer>> generateDiagonalHashMatrix(List<List<Character>> inputMatrix, int wordLength) {
        int numberOfRows = inputMatrix.size();
        int numberOfColumns = inputMatrix.get(0).size();

        List<List<Integer>> hashMatrix = createMatrix(numberOfRows, numberOfColumns);

        // [0] [1]   2   3   4
        // 0   [1]  [2]  3   4
        // 0   1    [2] [3]  4
        // 0   1     2  [3] [4]

        for (int column = 0; column < numberOfColumns - wordLength + 1; column++) {
            int initialHash = getDiagonalHash(inputMatrix, 0, wordLength, column, column + wordLength);
            hashMatrix.get(0).set(column, initialHash);
        }

        for (int row = 0; row < numberOfRows - wordLength + 1; row++) {
            int initialHash = getDiagonalHash(inputMatrix, row, row + wordLength, 0, wordLength);
            hashMatrix.get(row).set(0, initialHash);
        }

        for (int row = 1; row < numberOfRows - wordLength + 1; row++) {
            for (int column = 1; column < numberOfColumns - wordLength + 1; column++) {
                int previousHash = hashMatrix.get(row - 1).get(column - 1);
                int newHash = slideHashDiagonal(previousHash, inputMatrix, row - 1, column - 1, wordLength);
                hashMatrix.get(row).set(column, newHash);
            }
        }

        return hashMatrix;
    }

    // fuck me twice
    private List<List<Integer>> generateReverseDiagonalHashMatrix(List<List<Character>> inputMatrix, int wordLength) {
        int numberOfRows = inputMatrix.size();
        int numberOfColumns = inputMatrix.get(0).size();

        List<List<Integer>> hashMatrix = createMatrix(numberOfRows, numberOfColumns);

        for (int column = numberOfColumns - 1; column >= wordLength - 1; column--) {
            int initialHash = getReverseDiagonalHash(inputMatrix, 0, wordLength, column, column - wordLength - 1);
            hashMatrix.get(0).set(column, initialHash);
        }

        for (int row = 0; row < numberOfRows - wordLength + 1; row++) {
            int initialHash = getReverseDiagonalHash(
                    inputMatrix,
                    row,
                    row + wordLength,
                    numberOfColumns - 1,
                    numberOfColumns - wordLength - 1
            );
            hashMatrix.get(row).set(numberOfColumns - 1, initialHash);
        }

        for (int row = 1; row < numberOfRows - wordLength + 1; row++) {
            for (int column = numberOfColumns - 2; column >= wordLength - 1; column--) {
                int previousHash = hashMatrix.get(row - 1).get(column + 1);
                int newHash = slideHashReverseDiagonal(previousHash, inputMatrix, row - 1, column + 1, wordLength);
                hashMatrix.get(row).set(column, newHash);
            }
        }

        return hashMatrix;
    }

    private int slideHashVertical(int currentHash, List<List<Character>> matrix, int currentIndex, int wordLength, int column) {
        Character firstCharacter = matrix.get(currentIndex).get(column);
        int result = currentHash;        // hash[0] = arr[0]
        // hash[1] = arr[0] * 31 + arr[1]
        // hash[2] = 31 * (arr[0] * 31 + arr[1]) + arr[2] = arr[0] * 31 ^ 2 + arr[1] * 31 + arr[2]
        // hash[n] = arr[0] * 31 ^ n + arr[1] * 31 ^ (n-1) + ... + arr[n]
        // size = n + 1 => n = size - 1;
        // hash[n] - arr[0] ^ n = arr[1] * 31 ^ (n - 1) + ... + arr[n] =>
        // => hash[n + 1] = n * (hash[n] - arr[0] ^ n) + arr[n + 1]
        // => hash[n + 1] = arr[1] * 31 ^ n + arr[2] * 31 ^ (n - 1) ... + arr[n + 1]
        result -= firstCharacter.hashCode() * Math.pow(31, wordLength - 1); // we deduct first char
        return result * 31 + matrix.get(currentIndex + wordLength).get(column);
    }

    public int getHash(List<Character> characters, int startIndex, int endIndex) {
        int result = 0;

        for (int i = startIndex; i < characters.size() && i < endIndex; i++) {
            result = 31 * result + characters.get(i).hashCode();
        }

        return result;
    }

    public int getHash(String str) {
        return getHash(convert(str), 0, str.length());
    }

    public int getHashVertical(List<List<Character>> characters, int startIndex, int endIndex, int column) {
        int result = 0;
        for (int i = startIndex; i < characters.size() && i < endIndex; i++) {
            result = 31 * result + characters.get(i).get(column).hashCode();
        }

        return result;
    }

    public int getDiagonalHash(
            List<List<Character>> characters,
            int startRowIndex,
            int endRowIndex,
            int startColumnIndex,
            int endColumndIndex
    ) {
        int result = 0;

        int currentRow = startRowIndex;
        int currentColumn = startColumnIndex;

        while (currentRow < endRowIndex && currentColumn < endColumndIndex) {
            result = 31 * result + characters.get(currentRow).get(currentColumn).hashCode();

            currentRow++;
            currentColumn++;
        }

        return result;
    }

    public int getReverseDiagonalHash(
            List<List<Character>> characters,
            int startRowIndex,
            int endRowIndex,
            int startColumnIndex,
            int endColumnIndex
    ) {
        int result = 0;

        int currentRow = startRowIndex;
        int currentColumn = startColumnIndex;

        while (currentRow < endRowIndex && currentColumn > endColumnIndex) {
            result = 31 * result + characters.get(currentRow).get(currentColumn).hashCode();

            currentRow++;
            currentColumn--;
        }

        return result;
    }

    public int slideHashDiagonal(int currentHash, List<List<Character>> matrix, int currentRow, int currentColumn, int wordLength) {
        Character firstCharacter = matrix.get(currentRow).get(currentColumn);
        int result = currentHash;

        result -= firstCharacter.hashCode() * Math.pow(31, wordLength - 1); // we deduct first char
        return result * 31 + matrix.get(currentRow + wordLength).get(currentColumn + wordLength);
    }

    public int slideHashReverseDiagonal(int currentHash, List<List<Character>> matrix, int currentRow, int currentColumn, int wordLength) {
        Character firstCharacter = matrix.get(currentRow).get(currentColumn);
        int result = currentHash;

        result -= firstCharacter.hashCode() * Math.pow(31, wordLength - 1); // we deduct first char
        return result * 31 + matrix.get(currentRow + wordLength).get(currentColumn - wordLength);
    }

    private List<List<Integer>> createMatrix(int numberOfRows, int numberOfColumns) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < numberOfRows; i++) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < numberOfColumns; j++) {
                line.add(0);
            }
            matrix.add(line);
        }
        return matrix;
    }

    private int countMatches(
            List<List<Integer>> horizontalHashMatrix,
            List<List<Integer>> diagonalHashMatrix,
            List<List<Integer>> verticalHashMatrix,
            List<List<Integer>> reverseDiagonalHashMatrix,
            String word
    ) {
        int result = 0;

        int numberOfRows = horizontalHashMatrix.size();
        int numberOfColumns = horizontalHashMatrix.get(0).size();

        int wordHash = getHash(word);
        int reversedHash = getHash(reverse(word));

        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column < numberOfColumns; column++) {
                if (horizontalHashMatrix.get(row).get(column).equals(wordHash)) {
                    result++;
                }

                if (horizontalHashMatrix.get(row).get(column).equals(reversedHash)) {
                    result++;
                }

                if (diagonalHashMatrix.get(row).get(column).equals(wordHash)) {
                    result++;
                }

                if (diagonalHashMatrix.get(row).get(column).equals(reversedHash)) {
                    result++;
                }

                if (verticalHashMatrix.get(row).get(column).equals(wordHash)) {
                    result++;
                }

                if (verticalHashMatrix.get(row).get(column).equals(reversedHash)) {
                    result++;
                }

                if (reverseDiagonalHashMatrix.get(row).get(column).equals(wordHash)) {
                    result++;
                }

                if (reverseDiagonalHashMatrix.get(row).get(column).equals(reversedHash)) {
                    result++;
                }
            }
        }

        return result;
    }

    private int countMatchesTask2(List<List<Integer>> diagonalHashMatrix, List<List<Integer>> reverseDiagonalHashMatrix, String word) {
        int result = 0;

        int numberOfRows = diagonalHashMatrix.size();
        int numberOfColumns = diagonalHashMatrix.get(0).size();

        int wordHash = getHash(word);
        int reversedHash = getHash(reverse(word));

        // 0 1 2 3 4 (size = 5)
        // size -2 = 3
        // 0 1 2] 3 4
        for (int row = 0; row < numberOfRows - 2; row++) {
            for (int column = 0; column < numberOfColumns - 2; column++) {
                // [1] _ 2
                //  _  3 _
                //  4  _ 5
                // it will also cover this because it would have found it while look at the left most element
                //  1  _ [2]
                //  _  3  _
                //  4  _  5
                // It will cover this as well because the hash on [2] will equal hash on 4 if we'd calculate hash from 4 to 2 upwards and
                // reversed. The same is with mirrored X
                //   1   _  2
                //   _   3  _
                //  [4]  _  5
                if (diagonalHashMatrix.get(row).get(column).equals(wordHash) ||
                        diagonalHashMatrix.get(row).get(column).equals(reversedHash)) {

                    if (reverseDiagonalHashMatrix.get(row).get(column + 2).equals(wordHash) ||
                            reverseDiagonalHashMatrix.get(row).get(column + 2).equals(reversedHash)) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    private List<Character> convert(String str) {
        return str.chars().mapToObj(it -> (char) it).toList();
    }

    private String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public List<List<Character>> readInput(String input) {
        List<String> lines = Arrays.asList(input.trim().split("\\n"));

        return lines.stream().map(String::chars).map(it -> it.mapToObj(c -> (char) c).toList()).toList();
    }
}
