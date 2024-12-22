package aoc2024.helpers;


public record Day13Task(
        Button a,
        Button b,
        Result r
) {
    public record Button(long x, long y) { }

    public record Result(long x, long y) { }
}
