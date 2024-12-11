package aoc2024;

import aoc2024.inputs.Task7Input;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    public void testShort() {
        Task7 task = new Task7(Task7Input.TASK1_SHORT);
        assertEquals(3749, task.getResult());
    }

    @Test
    public void testFull() {
        Task7 task = new Task7(Task7Input.TASK1_FULL);
        assertEquals(3351424677624L, task.getResult());
    }


    @Test
    public void testShortTask2() {
        Task7 task = new Task7(Task7Input.TASK1_SHORT);
        assertEquals(11387, task.getResultTask2());
    }

    @Test
    public void testFullTask2() {
        Task7 task = new Task7(Task7Input.TASK1_FULL);
        assertEquals(10084493159758L, task.getResultTask2());
    }


}