package aoc2024;

import java.util.Arrays;
import java.util.List;

public class Task7_1Data {
    private long result;
    private List<Long> numbers;

    public Task7_1Data(long result, List<Long> numbers) {
        this.result = result;
        this.numbers = numbers;
    }

    public long getResult() {
        return result;
    }

    public List<Long> getNumbers() {
        return numbers;
    }

    public static List<Task7_1Data> parseInput(String input) {
        return Arrays.stream(input.trim().split("\\n"))
                .map(it -> Arrays.stream(it.split(":")).toList())
                .map(it -> new Task7_1Data(
                        Long.parseLong(it.get(0)),
                        Arrays.stream(it.get(1).split("\\s")).map(Long::parseLong).toList()
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
