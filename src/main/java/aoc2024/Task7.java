package aoc2024;

import aoc2024.common.Pair;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task7 {

    private final List<Task7Data> data;

    public Task7(List<Task7Data> data) {
        this.data = data;
    }

    public Task7(String input) {
        data = Task7Data.parseInput(input);
    }

    public List<Task7Data> findValidEquationsTask1() {
        return data.stream().filter(equation -> {
            long result = equation.getResult();
            return hasRightEquationTask1(equation.getNumbers(), result);
        }).toList();
    }

    public boolean hasRightEquationTask1(
            List<Long> numbers,
            long expectedResult
    ) {
        if (numbers.size() == 1) {
            return numbers.get(0) == expectedResult;
        }

        Long firstNumber = numbers.get(0);

        return hasRightEquationTask1(numbers, firstNumber, 1, expectedResult);
    }

    // 1 2 3 4 -> 1 * 2 + 3 + 4
    // 1 2 3 4 -> 1 + 2 + 3 + 4
    // 1 2 3 4 -> 1 * 2 * 3 + 4
    public boolean hasRightEquationTask1(
            List<Long> numbers,
            Long currentValue,
            int currentIndex,
            long expectedResult
    ) {
        if (numbers.size() == 1) {
            return numbers.get(0) == expectedResult;
        }

        if (currentIndex == numbers.size() - 1) {
            return currentValue + numbers.get(currentIndex) == expectedResult
                    || currentValue * numbers.get(currentIndex) == expectedResult;
        }

        long nextValue = numbers.get(currentIndex);

        return hasRightEquationTask1(numbers, currentValue + nextValue, currentIndex + 1, expectedResult) ||
                hasRightEquationTask1(numbers, currentValue * nextValue, currentIndex + 1, expectedResult);
    }

    public List<Task7Data> findValidEquationsTask2() {
        return data.stream().filter(equation -> {
            long result = equation.getResult();
            return hasRightEquationTask2(equation.getNumbers(), result);
        }).toList();
    }


    public boolean hasRightEquationTask2(
            List<Long> numbers,
            long expectedResult
    ) {
        if (numbers.size() == 1) {
            return numbers.get(0) == expectedResult;
        }

        Long firstNumber = numbers.get(0);

        return hasRightEquationTask2(numbers, firstNumber, 1, expectedResult);
    }

    // 1 2 3 4 -> 1 * 2 + 3 + 4
    // 1 2 3 4 -> 1 + 2 + 3 + 4
    // 1 2 3 4 -> 1 * 2 * 3 + 4
    public boolean hasRightEquationTask2(
            List<Long> numbers,
            Long currentValue,
            int currentIndex,
            long expectedResult
    ) {
        if (numbers.size() == 1) {
            return numbers.get(0) == expectedResult;
        }

        if (currentIndex == numbers.size() - 1) {
            return currentValue + numbers.get(currentIndex) == expectedResult ||
                    currentValue * numbers.get(currentIndex) == expectedResult ||
                    concat(currentValue, numbers.get(currentIndex)) == expectedResult;
        }

        long nextValue = numbers.get(currentIndex);

        return hasRightEquationTask2(numbers, currentValue + nextValue, currentIndex + 1, expectedResult) ||
                hasRightEquationTask2(numbers, currentValue * nextValue, currentIndex + 1, expectedResult) ||
                hasRightEquationTask2(numbers, concat(currentValue, nextValue), currentIndex + 1, expectedResult);
    }

    private long concat(long left, long right) {
        if (right == 0) {
            return left;
        }

        long currentDigit;
        while (right / 10 != 0) {
            currentDigit = right % 10;
            left *= 10;
            left += currentDigit;
            right /= 10;
        }

        left *= 10;
        left += right % 10;

        return left;
    }

    // 0 [1 2 3 4] ->  0 [1 [2 3 4] -> 0 [1 2 3 4] ->  0 [1 [2 [3 4] -> 0 [1] [2 [3] [4] ->  0 [1 [2 3] 4] -> 0 [1 [2] [3] [4]] ->
    // (0 1 2 + 3 +/* [4] -> 0 1 2 +/* {12, 7} -> 0 1 +/* {24, 14, 14, 9}
    // (0 1 + 2 + 3 + 4)
    // 0 1 + (2 * (3 + 4))
    // 0 1 + (2 * 3 * 4)
    // 0 1 * (2 + 3 + 4)
    // 0 1 * (2 * (3 + 4))
    // It misses 0 (1 + 2) * (3 + 4)
    // 0 1 + 2) + (3 + 4))
    public Set<Long> getAllCombinationsDPWithBrackets(
            List<Long> numbers,
            int fromIndex,
            int endIndexExcluded,
            Map<Pair<Integer, Integer>, Set<Long>> currentResults,
            long expectedResult
    ) {
        Set<Long> cachedResult = currentResults.get(new Pair<>(fromIndex, endIndexExcluded));
        if (cachedResult != null) {
            return cachedResult;
        }

        if (fromIndex == endIndexExcluded - 1) {
            Set<Long> result = new HashSet<>();
            result.add(numbers.get(fromIndex));
            return result;
        }

        Set<Long> subSolutionResult = new HashSet<>();

        for (int i = fromIndex; i < endIndexExcluded - 1; i++) {
            Set<Long> leftPartSolutions = getAllCombinationsDPWithBrackets(numbers, fromIndex, i + 1, currentResults, expectedResult);
            Set<Long> rightPartSolutions = getAllCombinationsDPWithBrackets(numbers, i + 1, endIndexExcluded, currentResults, expectedResult);

            Set<Long> multipliedResults = getAllMultiplications(leftPartSolutions, rightPartSolutions, expectedResult);
            Set<Long> summedResults = getAllSums(leftPartSolutions, rightPartSolutions, expectedResult);

            subSolutionResult.addAll(multipliedResults);
            subSolutionResult.addAll(summedResults);
        }

        currentResults.put(new Pair<>(fromIndex, endIndexExcluded), subSolutionResult);

        return subSolutionResult;
    }

    private static List<Long> multiplyAllResults(Set<Long> nextSubSolutionResult, int currentMultiplication) {
        return nextSubSolutionResult.stream().map(it -> it * currentMultiplication).toList();
    }

    private static List<Long> addToAllResults(Set<Long> nextSubSolutionResult, int number) {
        return nextSubSolutionResult.stream().map(it -> it + number).toList();
    }

    private static Set<Long> getAllMultiplications(Set<Long> leftPartSolutions, Set<Long> rightPartSolutions, long expectedResult) {
        Set<Long> result = new HashSet<>();

        for (Long leftPartSolution : leftPartSolutions) {
            for (Long rightPartSolution : rightPartSolutions) {
                long v = leftPartSolution * rightPartSolution;
                if (v == expectedResult) {
                    return Set.of(v);
                } else if (v < expectedResult) {
                    result.add(v);
                }
            }
        }

        return result;
    }

    private static Set<Long> getAllSums(Set<Long> leftPartSolutions, Set<Long> rightPartSolutions, Long expectedResult) {
        Set<Long> result = new HashSet<>();

        for (Long leftPartSolution : leftPartSolutions) {
            for (Long rightPartSolution : rightPartSolutions) {
                long v = leftPartSolution + rightPartSolution;
                if (v == expectedResult) {
                    return Set.of(v);
                } else if (v < expectedResult) {
                    result.add(v);
                }
            }
        }

        return result;
    }

    public Long getResult() {
        return findValidEquationsTask1().stream().map(Task7Data::getResult).reduce(0L, Long::sum);
    }

    public Long getResultTask2() {
        return findValidEquationsTask2().stream().map(Task7Data::getResult).reduce(0L, Long::sum);
    }
}
