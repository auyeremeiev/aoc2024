package aoc2024;

import aoc2024.inputs.Day13Input;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day13Test {

    @Test
    public void testShort() {
        assertEquals(480, new Day13(Day13Input.SHORT).getTask1Result());
        assertEquals(14, new Day13(Day13Input.SHORT_2).getTask1Result());
    }

    @Test
    public void testFull() {
        assertEquals(480, new Day13(Day13Input.FULL).getTask1Result());
    }

    @Test
    public void testFullTask2() {
        assertEquals(480, new Day13(Day13Input.FULL).getTask2Result());
    }
}