package aoc2024;

import aoc2024.common.Direction;
import aoc2024.common.Line;
import aoc2024.common.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static aoc2024.Task6TripResult.Task6BumpType.END_OF_FIELD;
import static aoc2024.Task6TripResult.Task6BumpType.OBSTACLE;
import static aoc2024.common.ListUtils.createBooleanMatrix;

public class Task6 {

    public static int getTask1Result(String input) {
        Task6Data task6Data = parseInput(input);
        long currentMilis = System.currentTimeMillis();
        int result = calculateLength(task6Data);
        long took = System.currentTimeMillis() - currentMilis;
        System.out.println("Took " + took + "ms");
        return result;
    }

    public static int getTask1ResultSimpleSolution(String input) {
        Task6Data data = parseInput(input);
        long currentMilis = System.currentTimeMillis();
        int result = calculateLengthSimpleSolution(data);
        long took = System.currentTimeMillis() - currentMilis;
        System.out.println("Took " + took + "ms");
        return result;
    }

    private static int calculateLengthSimpleSolution(Task6Data data) {
        List<List<Boolean>> visitedCells = createBooleanMatrix(data.getHeight(), data.getWidth());

        Pair<Integer, Integer> currentPoint = data.getStartingPoint();
        Line line = new Line(currentPoint);
        Direction currentDirection = Direction.UP;
        Task6TripResult tripResult = makeSingleTrip(currentPoint, data, currentDirection);
        List<Pair<Integer, Integer>> intersections = new ArrayList<>();
        ;
        while (tripResult.getBumpType() == OBSTACLE) {
            Pair<Integer, Integer> nextPoint = tripResult.getNextPoint();
            intersections.addAll(fillWithVisited(visitedCells, currentPoint, nextPoint));
            line.addPoint(nextPoint);
            currentDirection = switchDirection(currentDirection);
            currentPoint = nextPoint;
            tripResult = makeSingleTrip(currentPoint, data, currentDirection);
        }

        intersections.addAll(fillWithVisited(visitedCells, currentPoint, tripResult.getNextPoint()));
        line.addPoint(tripResult.getNextPoint()); // Getting last end of field point

        // intersections = 467
        return countFilledCells(visitedCells);
    }

    private static int calculateLength(Task6Data data) {
        Pair<Integer, Integer> currentPoint = data.getStartingPoint();
        Line line = new Line(currentPoint);
        Direction currentDirection = Direction.UP;
        Task6TripResult tripResult = makeSingleTrip(currentPoint, data, currentDirection);
        Set<Pair<Integer, Integer>> intersections = new HashSet<>();
        while (tripResult.getBumpType() == OBSTACLE) {
            Pair<Integer, Integer> nextPoint = tripResult.getNextPoint();
            intersections.addAll(line.getIntersections(nextPoint));
            line.addPoint(nextPoint);
            currentDirection = switchDirection(currentDirection);
            currentPoint = nextPoint;
            tripResult = makeSingleTrip(currentPoint, data, currentDirection);
        }

        intersections.addAll(line.getIntersections(tripResult.getNextPoint()));
        line.addPoint(tripResult.getNextPoint()); // Getting last end of field point

        // I could have improved performance if I counted the intersections only once in the end
        // intersections = 465
        return line.getLength() - intersections.size();
    }

    private static Task6TripResult makeSingleTrip(Pair<Integer, Integer> currentPoint,
                                                  Task6Data data,
                                                  Direction direction) {
        Optional<Pair<Integer, Integer>> closestObstacle;
        if (direction.isHorizontal()) {
            closestObstacle = data.getClosestObstaclesOnX(
                    currentPoint.getLeft(), currentPoint.getRight(), direction);
        } else {
            closestObstacle = data.getClosestObstaclesOnY(
                    currentPoint.getLeft(), currentPoint.getRight(), direction);
        }

        if (closestObstacle.isEmpty()) {
            return new Task6TripResult(headToTheEnd(currentPoint, direction, data), END_OF_FIELD);
        }

        return closestObstacle.map(it -> {
                    int x = it.getLeft();
                    int y = it.getRight();

                    // We stop just at the obstacle one cell before it
                    switch (direction) {
                        case UP -> x++;
                        case DOWN -> x--;
                        case RIGHT -> y--;
                        case LEFT -> y++;
                    }

                    return new Pair<>(x, y);
                }).map(it -> new Task6TripResult(it, OBSTACLE))
                .get();
    }

    private static Pair<Integer, Integer> headToTheEnd(Pair<Integer, Integer> currentPoint, Direction direction, Task6Data data) {
        return switch (direction) {
            case UP -> new Pair<>(0, currentPoint.getRight());
            case DOWN -> new Pair<>(data.getHeight() - 1, currentPoint.getRight());
            case RIGHT -> new Pair<>(currentPoint.getLeft(), data.getWidth() - 1);
            case LEFT -> new Pair<>(currentPoint.getLeft(), 0);
        };
    }

    private static Direction switchDirection(Direction direction) {
        return switch (direction) {
            case UP -> Direction.RIGHT;
            case RIGHT -> Direction.DOWN;
            case DOWN -> Direction.LEFT;
            case LEFT -> Direction.UP;
        };
    }

    public static Task6Data parseInput(String input) {
        List<List<Character>> map = Arrays.stream(input.split("\\n"))
                .map(String::chars)
                .map(chars -> chars.mapToObj(c -> (char) c).toList())
                .toList();

        Pair<Integer, Integer> startingPoint = null;
        List<Pair<Integer, Integer>> obstacles = new ArrayList<>();
        List<List<Task6Element>> resultMap = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            List<Task6Element> line = new ArrayList<>();
            List<Character> characters = map.get(i);
            for (int j = 0; j < characters.size(); j++) {
                if (characters.get(j) == '.') {
                    line.add(Task6Element.EMPTY);
                } else if (characters.get(j) == '#') {
                    line.add(Task6Element.OBSTACLE);
                    obstacles.add(new Pair<>(i, j));
                } else if (characters.get(j) == '^') {
                    startingPoint = new Pair<>(i, j);
                } else {
                    throw new IllegalStateException("Unknown element type");
                }
            }
            resultMap.add(line);
        }

        if (startingPoint == null) {
            throw new IllegalStateException("No starting point");
        }

        return new Task6Data(resultMap, obstacles, startingPoint);
    }


    private static List<Pair<Integer, Integer>> fillWithVisited(List<List<Boolean>> visitedCells, Pair<Integer, Integer> currentPoint, Pair<Integer, Integer> nextPoint) {
        Direction direction = Line.getDirection(currentPoint, nextPoint);
        List<Pair<Integer, Integer>> intersections = new ArrayList<>();
        switch (direction) {
            case UP -> {
                for (int i = currentPoint.getLeft(); i >= nextPoint.getLeft(); i--) {
                    if (visitedCells.get(i).get(currentPoint.getRight())) {
                        intersections.add(new Pair<>(i, currentPoint.getRight()));
                    }
                    visitedCells.get(i).set(currentPoint.getRight(), true);
                }
            }
            case DOWN -> {
                for (int i = currentPoint.getLeft(); i <= nextPoint.getLeft(); i++) {
                    if (visitedCells.get(i).get(currentPoint.getRight())) {
                        intersections.add(new Pair<>(i, currentPoint.getRight()));
                    }

                    visitedCells.get(i).set(currentPoint.getRight(), true);
                }
            }
            case RIGHT -> {
                for (int i = currentPoint.getRight(); i <= nextPoint.getRight(); i++) {
                    if (visitedCells.get(currentPoint.getLeft()).get(i)) {
                        intersections.add(new Pair<>(currentPoint.getLeft(), i));
                    }

                    visitedCells.get(currentPoint.getLeft()).set(i, true);
                }
            }
            case LEFT -> {
                for (int i = currentPoint.getRight(); i >= nextPoint.getRight(); i--) {
                    if (visitedCells.get(currentPoint.getLeft()).get(i)) {
                        intersections.add(new Pair<>(currentPoint.getLeft(), i));
                    }

                    visitedCells.get(currentPoint.getLeft()).set(i, true);
                }
            }
        }

        // The very first time it won't intersect with itself
        if (!intersections.isEmpty()) {
            intersections.remove(0); // exclude itself
        }
        return intersections;
    }

    private static int countFilledCells(List<List<Boolean>> visitedCells) {
        int result = 0;
        for (int i = 0; i < visitedCells.size(); i++) {
            for (int j = 0; j < visitedCells.size(); j++) {
                if (visitedCells.get(i).get(j)) {
                    result++;
                }
            }
        }
        return result;
    }
}
