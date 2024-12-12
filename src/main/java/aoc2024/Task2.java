package aoc2024;

import aoc2024.inputs.Task2Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static List<List<String>> countStability(List<List<String>> input) {
        List<List<String>> result = new ArrayList<>();

        for (List<String> line : input) {
            if (isStable(line)) {
                result.add(line);
            }
        }

        return result;
    }

    private static boolean isStable(List<String> numbersStrings) {
        List<Integer> numbers = numbersStrings.stream().map(Integer::parseInt).toList();

        boolean badLevelWasAlreadyFound = false;

        if (numbers.size() < 3) {
            throw new IllegalArgumentException("Level length is expected to be more than 2");
        }

        Direction determinedLineDirection;
        int startingIndex = 0;

        determinedLineDirection = getDirection(numbers.get(0), numbers.get(1));
        if (determinedLineDirection == Direction.EVEN) {
            badLevelWasAlreadyFound = true;
            startingIndex = 1;
        }

        for (int i = startingIndex; i < numbers.size() - 1; i++) {
            if (isBad(numbers.get(i), numbers.get(i + 1), determinedLineDirection)) {
                if (badLevelWasAlreadyFound) {
                    return false;
                }

                if (i < numbers.size() - 2) {
                    if (isBad(numbers.get(i), numbers.get(i + 2), determinedLineDirection)) {
                        return false;
                    } else {
                        i++;
                    }
                }

                badLevelWasAlreadyFound = true;
            }
        }

        return true;
    }

    private static boolean isBad(int number1, int number2, Direction lineDirection) {
        Direction currentDirection = getDirection(number1, number2);
        if (currentDirection == Direction.EVEN) {
            return true;
        }

        if (currentDirection == Direction.DESCENDING && lineDirection == Direction.ASCENDING) {
            return true;
        }

        if (currentDirection == Direction.ASCENDING && lineDirection == Direction.DESCENDING) {
            return true;
        }

        return Math.abs(number1 - number2) > 3;
    }

    private static Direction getDirection(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return Direction.ASCENDING;
        } else if (firstNumber == secondNumber) {
            return Direction.EVEN;
        } else {
            return Direction.DESCENDING;
        }
    }

    public static List<List<String>> readInput() {
        String input = Task2Input.TASK_2;
        String[] lines = input.split("\\n");

        return Arrays.stream(lines).map(it -> Arrays.asList(it.split("\\s"))).toList();
    }

    private enum Direction {
        ASCENDING, DESCENDING, EVEN
    }

}
