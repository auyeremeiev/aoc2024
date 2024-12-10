package aoc2024;

import aoc2024.inputs.Task5Input;
import org.junit.jupiter.api.Test;

import static aoc2024.Task5.getFixedInCorrectlyOrderedLinesResultThroughSort;
import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    public void testTask5() {
        assertEquals(143, Task5.getCorrectlyOrderedLinesResult(Task5Input.INPUT_SHORT));
    }

    @Test
    public void testTask5Full() {
        assertEquals(4662, Task5.getCorrectlyOrderedLinesResult(Task5Input.INPUT_FULL));
    }

    @Test
    public void testTask5SubTask2Full() {
        assertEquals(5900, getFixedInCorrectlyOrderedLinesResultThroughSort(Task5Input.INPUT_TASK2_FULL));
    }

}