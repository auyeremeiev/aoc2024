package aoc2024;

import org.junit.jupiter.api.Test;

import static aoc2024.Task6Inputs.TASK1_FULL;
import static aoc2024.Task6Inputs.TASK1_SHORT;
import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    public void testTask1Short() {
        assertEquals(41, Task6.getTask1Result(TASK1_SHORT));
    }

    @Test
    public void testTask1Full() {
        assertEquals(4967, Task6.getTask1Result(TASK1_FULL));
    }

    @Test
    public void testTask1SimpleSolutionShort() {
        assertEquals(41, Task6.getTask1ResultSimpleSolution(TASK1_SHORT));
    }

    @Test
    public void testTask1SimpleSolutionFull() {
        assertEquals(4967, Task6.getTask1ResultSimpleSolution(TASK1_FULL));
    }
}