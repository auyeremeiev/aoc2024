package aoc2024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void itShouldProcessShortInputCorrectly() {
        assertEquals(161, Task3.getResultSubtask1(Task3Input.INPUT_SHORT));
    }

    @Test
    public void itShouldProcessFullInputCorrectly() {
        assertEquals(156388521, Task3.getResultSubtask1(Task3Input.INPUT));
    }

    @Test
    public void itShouldProcessShortInputCorrectlySubtask2() {
        assertEquals(48, Task3.getResultSubtask2(Task3Input.INPUT_SHORT_2));
    }

    @Test
    public void itShouldProcessFullInputCorrectlySubtask2() {
        assertEquals(75920122, Task3.getResultSubtask2(Task3Input.INPUT_2));
    }
}