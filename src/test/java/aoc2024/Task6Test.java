package aoc2024;

import aoc2024.common.Direction;
import aoc2024.common.Pair;
import org.junit.jupiter.api.Test;

import static aoc2024.Task6Inputs.IS_LOOP_1;
import static aoc2024.Task6Inputs.IS_LOOP_2;
import static aoc2024.Task6Inputs.IS_LOOP_3;
import static aoc2024.Task6Inputs.IS_LOOP_6;
import static aoc2024.Task6Inputs.IS_LOOP_7;
import static aoc2024.Task6Inputs.TASK1_FULL;
import static aoc2024.Task6Inputs.TASK1_SHORT;
import static aoc2024.Task6Inputs.TASK2_FULL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void testTask2Short() {
        assertEquals(6, Task6.getTask2ResultJumpingSolution(TASK1_SHORT));
    }

    @Test
    public void testTask2Full() {
        assertEquals(1967, Task6.getTask2ResultJumpingSolution(TASK2_FULL));
    }

    @Test
    public void testTask2LoopFunction() {
        assertTrue(Task6.willCreateLoop(
                new Pair<>(6, 4),
                null,
                Direction.UP,
                Task6.parseInput(IS_LOOP_1)));
        assertFalse(Task6.willCreateLoop(
                new Pair<>(1, 4),
                null,
                Direction.RIGHT,
                Task6.parseInput(IS_LOOP_2)));

        assertTrue(Task6.willCreateLoop(
                new Pair<>(1, 4),
                null,
                Direction.RIGHT,
                Task6.parseInput(IS_LOOP_3)));

        Task6Data task6Data = Task6.parseInput(IS_LOOP_6);
        assertTrue(Task6.willCreateLoop(
                task6Data.getStartingPoint(),
                null,
                Direction.UP,
                task6Data));

        task6Data = Task6.parseInput(IS_LOOP_7);
        assertTrue(Task6.willCreateLoop(
                task6Data.getStartingPoint(),
                null,
                Direction.UP,
                task6Data));
    }
}