package aoc2024;

import aoc2024.common.Pair;
import aoc2024.inputs.Day9Input;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day9Test {

    @Test
    public void testTask1Short() {
        Day9 day9 = new Day9(Day9Input.TASK_1_SHORT);
        assertEquals(
                List.of(
                        Pair.of(0, 2),
                        Pair.of(9, 2),
                        Pair.of(8, 1),
                        Pair.of(1, 3),
                        Pair.of(8, 3),
                        Pair.of(2, 1),
                        Pair.of(7, 3),
                        Pair.of(3, 3),
                        Pair.of(6, 1),
                        Pair.of(4, 2),
                        Pair.of(6, 1),
                        Pair.of(5, 4),
                        Pair.of(6, 1),
                        Pair.of(6, 1)
                ), day9.getTask1ResultNumbers());
        assertEquals(1928, new Day9("2333133121414131402").getTask1ResultSum());
    }

    @Test
    public void testTask1Full() {
        Day9 day9 = new Day9(Day9Input.TASK_1_FULL);
        assertEquals(1928, day9.getTask1ResultSum());
    }

}