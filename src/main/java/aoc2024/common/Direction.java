package aoc2024.common;

public enum Direction {
    UP,
    DOWN,
    RIGHT,
    LEFT;

    public boolean isHorizontal() {
        return this == RIGHT || this == LEFT;
    }

    public boolean isVertical() {
        return this == UP || this == DOWN;
    }
}
