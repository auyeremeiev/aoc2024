package aoc2024;

import aoc2024.inputs.Day4Input;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day4Test {

    @Test
    public void testSubtask1VeryShort() {
        Day4 day4 = new Day4();
        long counter = day4.countForTask1(Day4Input.INPUT_VERY_SHORT);
        assertEquals(4, counter);
    }

    @Test
    public void testSubtask1Short() {
        Day4 day4 = new Day4();
        long counter = day4.countForTask1(Day4Input.INPUT_SHORT);
        assertEquals(18, counter);
    }

    @Test
    public void testSubtask1Full() {
        Day4 day4 = new Day4();
        long counter = day4.countForTask1(Day4Input.INPUT);
        assertEquals(18, counter);
    }

    @Test
    public void testSubtask2Short() {
        Day4 day4 = new Day4();
        long counter = day4.countForTask2(Day4Input.INPUT_TASK_2_SHORT);
        assertEquals(9, counter);
    }

    @Test
    public void testSubtask2Full() {
        Day4 day4 = new Day4();
        long counter = day4.countForTask2(Day4Input.INPUT_TASK2);
        assertEquals(1998, counter);
    }

}