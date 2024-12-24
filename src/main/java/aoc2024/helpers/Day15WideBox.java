package aoc2024.helpers;

import aoc2024.common.Direction;
import aoc2024.common.Point;

public record Day15WideBox(Point left, Point right) {

    public static Day15WideBox boxWithLeftBase(Point left) {
        return new Day15WideBox(left, Direction.RIGHT.nextPoint(left));
    }

    public static Day15WideBox boxWithRightBase(Point right) {
        return new Day15WideBox(Direction.LEFT.nextPoint(right), right);
    }
}
