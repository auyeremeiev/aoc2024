package aoc2024.helpers;

import java.util.Arrays;
import java.util.List;

public class Day7Data {
    private long result;
    private List<Long> numbers;

    public Day7Data(long result, List<Long> numbers) {
        this.result = result;
        this.numbers = numbers;
    }

    public long getResult() {
        return result;
    }

    public List<Long> getNumbers() {
        return numbers;
    }

    public static List<Day7Data> parseInput(String input) {
        return Arrays.stream(input.trim().split("\\n"))
                .map(it -> Arrays.stream(it.split(": ")).toList())
                .map(it -> new Day7Data(
                        Long.parseLong(it.get(0)),
                        Arrays.stream(it.get(1).split("\\s{1,}")).map(Long::parseLong).toList()
                )).toList();
    }

    @Override
    public String toString() {
        return "Task7Data{" +
                "result=" + result +
                ", numbers=" + numbers +
                '}';
    }
}
