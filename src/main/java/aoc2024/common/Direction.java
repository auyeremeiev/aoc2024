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

    public Direction switchClockWise() {
        return switch (this) {
            case UP -> Direction.RIGHT;
            case RIGHT -> Direction.DOWN;
            case DOWN -> Direction.LEFT;
            case LEFT -> Direction.UP;
        };
    }

    public Direction switchCounterClockWise() {
        return switch (this) {
            case UP -> Direction.LEFT;
            case LEFT -> Direction.DOWN;
            case DOWN -> Direction.RIGHT;
            case RIGHT -> Direction.UP;
        };
    }

    public Point move(Point point) {
        return switch (this) {
            case UP -> new Point(point.getLeft() - 1, point.getRight());
            case LEFT -> new Point(point.getLeft(), point.getRight() - 1);
            case DOWN -> new Point(point.getLeft() + 1, point.getRight());
            case RIGHT -> new Point(point.getLeft(), point.getRight() + 1);
        };
    }
}
