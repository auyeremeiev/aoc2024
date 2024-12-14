package aoc2024;

import org.junit.jupiter.api.Test;

import static aoc2024.inputs.Day8Input.TASK_1_SHORT;
import static aoc2024.inputs.Day8Input.TASK_1_FULL;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day8Test {

    @Test
    public void testSmallInputTask1() {
        Day8 day8 = new Day8(TASK_1_SHORT);
        assertEquals(14, day8.getTask1AntinodesNumber());
    }

    @Test
    public void testSmallInputTask2() {
        Day8 day8 = new Day8(TASK_1_FULL);
        assertEquals(247, day8.getTask1AntinodesNumber());
    }
}