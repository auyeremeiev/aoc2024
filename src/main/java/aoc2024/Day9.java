package aoc2024;

import aoc2024.common.Pair;
import java.util.ArrayList;
import java.util.List;

public class Day9 {

    private List<Integer> line;

    public Day9(String input) {
        line = new ArrayList<>(input.chars().mapToObj(Character::getNumericValue).toList());
    }

    public long getTask1ResultSum() {
        long result = 0;
        int currentIndex = 0;
        List<Pair<Integer, Integer>> resultString = getTask1ResultNumbers();
        for (Pair<Integer, Integer> number : resultString) {
            result += getSum(currentIndex, number);
            currentIndex += number.getRight();
        }

        return result;
    }

    // Doing at late in the friday night. Probably writing crap
    private long getSum(int index, Pair<Integer, Integer> number) {
        long result = 0;
        int currentIndex = index;
        long fileBlock = number.getLeft();

        while (number.getRight() - (currentIndex - index) > 0) {
            result += currentIndex * fileBlock;
            currentIndex++;
        }
        return result;
    }

    public List<Pair<Integer, Integer>> getTask1ResultNumbers() {
        List<Pair<Integer, Integer>> result = new ArrayList<>(); // file block and amount

        int left = 0;
        int right = line.size() - 1;

        while (left <= right) {
            while (line.get(left) == 0) {
                left++;
            }

            while ((left % 2 == 0 || line.get(left) == 0) && left <= right) {
                result.add(new Pair<>(left / 2, line.get(left)));
                left++;
            }

            while (right % 2 != 0 || (line.get(right) == 0)) {
                right--;
            }

            Integer spacesAmount = line.get(left);
            if (spacesAmount != 0 && left <= right) {
                int fileBlocksToReallocate = Math.min(spacesAmount, line.get(right));
                line.set(right, line.get(right) - fileBlocksToReallocate);
                line.set(left, spacesAmount - fileBlocksToReallocate);

                // We either used up all the space from the left
                // or we've taken all the blocks from the rigth and we need to move on
                result.add(new Pair<>(right / 2, fileBlocksToReallocate));
            }
        }

        return result;
    }
}
