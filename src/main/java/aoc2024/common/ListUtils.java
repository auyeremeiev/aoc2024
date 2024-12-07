package aoc2024.common;

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
}
