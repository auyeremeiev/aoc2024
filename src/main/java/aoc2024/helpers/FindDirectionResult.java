package aoc2024.helpers;

import aoc2024.common.Direction;
import aoc2024.common.Point;

public record FindDirectionResult(Direction direction, Point point, int turnedTimes) {}
