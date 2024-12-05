package aoc2024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    public void testSubtask1VeryShort() {
        Task4 task4 = new Task4();
        long counter = task4.countForTask1(Task4Input.INPUT_VERY_SHORT);
        assertEquals(4, counter);
    }

    @Test
    public void testSubtask1Short() {
        Task4 task4 = new Task4();
        long counter = task4.countForTask1(Task4Input.INPUT_SHORT);
        assertEquals(18, counter);
    }

    @Test
    public void testSubtask1Full() {
        Task4 task4 = new Task4();
        long counter = task4.countForTask1(Task4Input.INPUT);
        assertEquals(18, counter);
    }

}