package aoc2024;

import aoc2024.inputs.Day15Task1Input;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day15Task1Test {

    @Test
    public void testTask1Short() {
        assertEquals(2028L, new Day15Task1(Day15Task1Input.SHORT).getTaskResult());
        assertEquals(10092L, new Day15Task1(Day15Task1Input.SHORT_2).getTaskResult());
    }

    @Test
    public void testTask1Full() {
        assertEquals(1456590L, new Day15Task1(Day15Task1Input.FULL).getTaskResult());
    }

}