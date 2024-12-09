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

    public static int getTask2ResultJumpingSolution(String input) {
        Task6Data data = parseInput(input);
        long currentMilis = System.currentTimeMillis();
        int result = calculateTask2JumpingSolution(data);
        long took = System.currentTimeMillis() - currentMilis;
        System.out.println("Took " + took + "ms");

        return result;
    }

    private static int calculateTask2JumpingSolution(Task6Data data) {
        Pair<Integer, Integer> currentPoint = data.getStartingPoint();
        Direction currentDirection = Direction.UP;
        Set<Pair<Integer, Integer>> loopMakingObstacles = new HashSet<>();
        Task6TripResult tripResult = getNextTripPoint(currentPoint, data, currentDirection);
        while (tripResult.getBumpType() == OBSTACLE) {
            Pair<Integer, Integer> nextPoint = tripResult.getNextPoint();
            loopMakingObstacles.addAll(getLoopingObstacles(currentPoint, nextPoint, data));
            currentDirection = switchDirection(currentDirection);
            currentPoint = nextPoint;
            tripResult = getNextTripPoint(currentPoint, data, currentDirection);
        }

        Pair<Integer, Integer> nextPoint = tripResult.getNextPoint();
        loopMakingObstacles.addAll(getLoopingObstacles(currentPoint, nextPoint, data));

        return loopMakingObstacles.size();
    }

    private static int calculateLengthSimpleSolution(Task6Data data) {
        List<List<Boolean>> visitedCells = createBooleanMatrix(data.getHeight(), data.getWidth());

        Pair<Integer, Integer> currentPoint = data.getStartingPoint();
        Line line = new Line(currentPoint);
        Direction currentDirection = Direction.UP;
        Task6TripResult tripResult = getNextTripPoint(currentPoint, data, currentDirection);
        List<Pair<Integer, Integer>> intersections = new ArrayList<>();
        ;
        while (tripResult.getBumpType() == OBSTACLE) {
            Pair<Integer, Integer> nextPoint = tripResult.getNextPoint();
            intersections.addAll(fillWithVisited(visitedCells, currentPoint, nextPoint));
            line.addPoint(nextPoint);
            currentDirection = switchDirection(currentDirection);
            currentPoint = nextPoint;
            tripResult = getNextTripPoint(currentPoint, data, currentDirection);
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
        Task6TripResult tripResult = getNextTripPoint(currentPoint, data, currentDirection);
        Set<Pair<Integer, Integer>> intersections = new HashSet<>();
        while (tripResult.getBumpType() == OBSTACLE) {
            Pair<Integer, Integer> nextPoint = tripResult.getNextPoint();
            intersections.addAll(line.getIntersections(nextPoint));
            line.addPoint(nextPoint);
            currentDirection = switchDirection(currentDirection);
            currentPoint = nextPoint;
            tripResult = getNextTripPoint(currentPoint, data, currentDirection);
        }

        intersections.addAll(line.getIntersections(tripResult.getNextPoint()));
        line.addPoint(tripResult.getNextPoint()); // Getting last end of field point

        // I could have improved performance if I counted the intersections only once in the end
        // intersections = 465
        return line.getLength() - intersections.size();
    }

    private static List<Pair<Integer, Integer>> getLoopingObstacles(
            Pair<Integer, Integer> currentPoint,
            Pair<Integer, Integer> nextPoint,
            Task6Data data
    ) {
        Direction direction = Line.getDirection(currentPoint, nextPoint);
        List<Pair<Integer, Integer>> result = new ArrayList<>();
        Pair<Integer, Integer> newObstacle;
        switch (direction) {
            case UP -> {
                for (int i = currentPoint.getLeft() - 1; i >= nextPoint.getLeft(); i--) {
                    newObstacle = new Pair<>(i, currentPoint.getRight());
                    if (willCreateLoop(currentPoint, newObstacle, direction, data)) {
                        result.add(newObstacle);
                    }
                }
            }
            case DOWN -> {
                for (int i = currentPoint.getLeft() + 1; i <= nextPoint.getLeft(); i++) {
                    newObstacle = new Pair<>(i, currentPoint.getRight());
                    if (willCreateLoop(currentPoint, newObstacle, direction, data)) {
                        result.add(newObstacle);
                    }
                }
            }
            case RIGHT -> {
                for (int i = currentPoint.getRight() + 1; i <= nextPoint.getRight(); i++) {
                    newObstacle = new Pair<>(currentPoint.getLeft(), i);
                    if (willCreateLoop(currentPoint, newObstacle, direction, data)) {
                        result.add(newObstacle);
                    }
                }
            }
            case LEFT -> {
                for (int i = currentPoint.getRight() - 1; i >= nextPoint.getRight(); i--) {
                    newObstacle = new Pair<>(currentPoint.getLeft(), i);
                    if (willCreateLoop(currentPoint, newObstacle, direction, data)) {
                        result.add(newObstacle);
                    }
                }
            }
        }

        return result;
    }

    public static boolean willCreateLoop(
            Pair<Integer, Integer> startingPoint,
            Pair<Integer, Integer> extraObstacle,
            Direction direction,
            Task6Data data) {
        Direction currentDirection = direction;
        Set<Pair<Integer, Integer>> visitedPoints = new HashSet<>();
        visitedPoints.add(startingPoint); // we start at the obstacle and turn immediately
        Pair<Integer, Integer> currentPoint = startingPoint;
        Task6TripResult tripResult = getNextTripPointWithExtraObstacle(startingPoint, extraObstacle, data, direction);
        while(tripResult.getBumpType() != END_OF_FIELD) {
            Pair<Integer, Integer> nextPoint = tripResult.getNextPoint();
            if (visitedPoints.contains(nextPoint)
                    && !currentPoint.equals(nextPoint)
            ) {
                return true;
            }
            currentPoint = nextPoint;
            visitedPoints.add(currentPoint);
            currentDirection = switchDirection(currentDirection);
            tripResult = getNextTripPointWithExtraObstacle(currentPoint, extraObstacle, data, currentDirection);
        }

        return false;
    }

    private static Task6TripResult getNextTripPoint(Pair<Integer, Integer> currentPoint,
                                                    Task6Data data,
                                                    Direction direction) {
        return getNextTripPointWithExtraObstacle(currentPoint, null, data, direction);
    }

    private static Task6TripResult getNextTripPointWithExtraObstacle(
            Pair<Integer, Integer> currentPoint,
            Pair<Integer, Integer> extraObstacle,
            Task6Data data,
            Direction direction) {
        Optional<Pair<Integer, Integer>> closestObstacle;
        if (direction.isHorizontal()) {
            closestObstacle = data.getClosestObstaclesOnXWithExtraObstacle(
                    currentPoint.getLeft(), currentPoint.getRight(), direction, extraObstacle);
        } else {
            closestObstacle = data.getClosestObstaclesOnYWithExtraObstacle(
                    currentPoint.getLeft(), currentPoint.getRight(), direction, extraObstacle);
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
