package aoc2024.common;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ListUtilsTest {

    public void testAddToSortedList() {
        List<Integer> list = new ArrayList<>(List.of(4, 8, 9, 13, 24, 24, 29));
        ListUtils.addToSortedList(list, 3);
        assertThat(list).containsAll(List.of(3, 4, 8, 9, 13, 24, 24, 29));
    }

}