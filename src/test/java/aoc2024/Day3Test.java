package aoc2024;

import aoc2024.inputs.Day3Input;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day3Test {

    @Test
    public void itShouldProcessShortInputCorrectly() {
        assertEquals(161, Day3.getResultSubtask1(Day3Input.INPUT_SHORT));
    }

    @Test
    public void itShouldProcessFullInputCorrectly() {
        assertEquals(156388521, Day3.getResultSubtask1(Day3Input.INPUT));
    }

    @Test
    public void itShouldProcessShortInputCorrectlySubtask2() {
        assertEquals(48, Day3.getResultSubtask2(Day3Input.INPUT_SHORT_2));
    }

    @Test
    public void itShouldProcessFullInputCorrectlySubtask2() {
        assertEquals(75920122, Day3.getResultSubtask2(Day3Input.INPUT_2));
    }
}