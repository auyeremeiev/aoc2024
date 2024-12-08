package aoc2024.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ListUtils {

    public static <T> void swap(List<T> list, int i, int j) {
        var temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static <T> void moveAndShift(List<T> list, int i, int j) {
        var temp = list.remove(j);
        list.add(i, temp);
    }

    public static int minNumber(Collection<Integer> list) {
        int result = Integer.MAX_VALUE;
        for (Integer number : list) {
            if (number < result) {
                result = number;
            }
        }
        return result;
    }

    public static int maxNumber(Collection<Integer> list) {
        int result = Integer.MIN_VALUE;
        for (Integer number : list) {
            if (number > result) {
                result = number;
            }
        }
        return result;
    }

    public static Optional<Integer> findFirstEncounterIndex(List<Integer> list, int from, int toInclusive, int number) {
        return findFirstEncounterIndexForAny(list, from, toInclusive, List.of(number));
    }

    public static Optional<Integer> findFirstEncounterIndexForAny(List<Integer> list, int from, int toInclusive, Collection<Integer> numbers) {
        for (int i = from; i < toInclusive; i++) {
            if (numbers.contains(list.get(i))) {
                return Optional.of(i);
            }
        }

        return Optional.empty();
    }

    public static List<List<Integer>> createMatrix(int numberOfRows, int numberOfColumns) {
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

    public static List<List<Boolean>> createBooleanMatrix(int numberOfRows, int numberOfColumns) {
        List<List<Boolean>> matrix = new ArrayList<>();
        for (int i = 0; i < numberOfRows; i++) {
            List<Boolean> line = new ArrayList<>();
            for (int j = 0; j < numberOfColumns; j++) {
                line.add(false);
            }
            matrix.add(line);
        }
        return matrix;
    }

    public static String printMatrix(List<List<?>> matrix) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < matrix.size(); i++) {
            List<String> line = new ArrayList<>();
            for (int j = 0; j < matrix.get(i).size(); j++) {
                line.add(matrix.get(i).get(j).toString());
            }
            builder.append(String.join(",", line)).append("\n");
        }

        return builder.toString();
    }
}
