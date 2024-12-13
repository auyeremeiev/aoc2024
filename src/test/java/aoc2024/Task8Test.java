package aoc2024;

import org.junit.jupiter.api.Test;

import static aoc2024.inputs.Task8Input.TASK_1_SHORT;
import static aoc2024.inputs.Task8Input.TASK_1_FULL;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task8Test {

    @Test
    public void testSmallInputTask1() {
        Task8 task8 = new Task8(TASK_1_SHORT);
        assertEquals(14, task8.getTask1AntinodesNumber());
    }

    @Test
    public void testSmallInputTask2() {
        Task8 task8 = new Task8(TASK_1_FULL);
        assertEquals(247, task8.getTask1AntinodesNumber());
    }
}