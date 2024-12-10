package aoc2024;

import aoc2024.common.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task7_1 {

    private final List<Task7_1Data> data;

    public Task7_1(List<Task7_1Data> data) {
        this.data = data;
    }

    public Task7_1(String input) {
        data = Task7_1Data.parseInput(input);
    }

    public List<Task7_1Data> findValidEquations() {
        for (Task7_1Data equation : data) {
            long result = equation.getResult();

        }

        return new ArrayList<>();
    }

    public List<Long> getAllCombinations(
            List<Long> numbers,
            int fromIndex,
            int multiplierIndex,
            int endIndexExcluded,
            Map<Pair<Integer, Integer>, List<Integer>> currentResults) {
        List<Long> subSolutionResult = new ArrayList<>();

        return subSolutionResult;
    }

    public Long getResult() {
        return findValidEquations().stream()
                .map(Task7_1Data::getResult)
                .reduce(0L, Long::sum);
    }
}
