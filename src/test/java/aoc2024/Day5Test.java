package aoc2024;

import aoc2024.inputs.Day5Input;
import org.junit.jupiter.api.Test;

import static aoc2024.Day5.getFixedInCorrectlyOrderedLinesResultThroughSort;
import static org.junit.jupiter.api.Assertions.*;

class Day5Test {

    @Test
    public void testTask5() {
        assertEquals(143, Day5.getCorrectlyOrderedLinesResult(Day5Input.INPUT_SHORT));
    }

    @Test
    public void testTask5Full() {
        assertEquals(4662, Day5.getCorrectlyOrderedLinesResult(Day5Input.INPUT_FULL));
    }

    @Test
    public void testTask5SubTask2Full() {
        assertEquals(5900, getFixedInCorrectlyOrderedLinesResultThroughSort(Day5Input.INPUT_TASK2_FULL));
    }

}