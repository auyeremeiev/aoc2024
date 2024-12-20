package aoc2024;

import aoc2024.common.Direction;
import aoc2024.common.ListUtils;
import aoc2024.common.Point;
import aoc2024.helpers.Day12Region;
import aoc2024.helpers.FindDirectionResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static aoc2024.common.Direction.UP;

public class Day12 {

    private final List<List<Character>> garden;
    private final int height;
    private final int width;

    public Day12(String input) {
        garden = input.lines().map(it -> it.chars().mapToObj(charc -> (char) charc).toList()).toList();
        height = garden.size();
        width = garden.get(0).size();
    }

    public int getTask1Result() {
        List<List<Integer>> regionsMap = ListUtils.createMatrix(height, width);

        List<Day12Region> regions = getAllRegions(regionsMap);
        return regions.stream().map(this::calculatePrice).reduce(0, Long::sum);
    }

    public List<Day12Region> getAllRegions(List<List<Integer>> regionsMap) {
        List<Day12Region> regions = new ArrayList<>();

        int currentRegionId = 0;
        for (int i = 0; i < garden.size(); i++) {
            for (int j = 0; j < garden.get(i).size(); j++) {
                if (regionsMap.get(i).get(j) == 0) {
                    Day12Region newRegion = new Day12Region(currentRegionId, garden.get(i).get(j));
                    exploreRegion(regionsMap, garden, newRegion, i, j);
                    regions.add(newRegion);
                }
            }
        }

        return regions;
    }

    private void exploreRegion(
            List<List<Integer>> regionsMap,
            List<List<Character>> garden,
            Day12Region region,
            int i,
            int j) {
        regionsMap.get(i).set(j, region.getRegionId());
        Point currentPoint = new Point(i, j);
        region.addPoint(currentPoint);

        if (garden.get(i + 1).get(j) == region.getCharacter() && regionsMap.get(i + 1).get(j) == 0) {
            exploreRegion(regionsMap, garden, region, i + 1, j);
        }

        if (garden.get(i - 1).get(j) == region.getCharacter() && regionsMap.get(i - 1).get(j) == 0) {
            exploreRegion(regionsMap, garden, region, i - 1, j);
        }

        if (garden.get(i).get(j + 1) == region.getCharacter() && regionsMap.get(i).get(j + 1) == 0) {
            exploreRegion(regionsMap, garden, region, i, j + 1);
        }

        if (garden.get(i).get(j - 1) == region.getCharacter() && regionsMap.get(i).get(j - 1) == 0) {
            exploreRegion(regionsMap, garden, region, i, j - 1);
        }

        if (isRegionEdgePoint(garden, region, currentPoint)) {
            region.addEdgePoint(currentPoint);
        }
    }

    private boolean isRegionEdgePoint(List<List<Character>> garden, Day12Region region, Point currentPoint) {
        if (ListUtils.isAtEdge(garden, currentPoint)) {
            return true;
        }

        Integer i = currentPoint.getLeft();
        Integer j = currentPoint.getRight();

        return garden.get(i + 1).get(j) != region.getCharacter()
                || garden.get(i - 1).get(j) != region.getCharacter()
                || garden.get(i).get(j + 1) != region.getCharacter()
                || garden.get(i).get(j - 1) != region.getCharacter();
    }

    private long calculatePrice(
            List<List<Character>> garden,
            List<List<Integer>> regionsMap,
            Day12Region region) {
        Set<Point> remainingEdgePoints = new HashSet<>(region.getEdgePoints());
        if (remainingEdgePoints.size() == 1) {
            return 4;
        }

        Point currentStartingEdgePoint = remainingEdgePoints.stream().findAny().orElseThrow();
        remainingEdgePoints.remove(currentStartingEdgePoint);

        // traverse through all perimeters
        traversingSinglePerimeter(region, currentStartingEdgePoint);
    }

    private long traversingSinglePerimeter(Day12Region region, Point currentStartingEdgePoint) {
        long perimeterSum = 0;
        Point currentEdgePoint = currentStartingEdgePoint;
        FindDirectionResult firstFencingDirection = findFirstFencingPoint(region, currentStartingEdgePoint);
        Direction currentDirection = firstFencingDirection.direction();
        currentDirection = currentDirection.switchClockWise();

        while (!currentEdgePoint.equals(firstFencingDirection.point())) {
            currentDirection = currentDirection.switchCounterClockWise();
            int i = 0;
            Point pointAhead = currentDirection.move(currentEdgePoint);
            while ((i < 4 && !region.getPoints().contains(pointAhead)) ||
                    pointAhead.equals(firstFencingDirection.point())) {
                currentDirection = currentDirection.switchClockWise();
                pointAhead = currentDirection.move(pointAhead);
                i++;
            }
            perimeterSum += i;
            if (i == 4) {
                return perimeterSum;
            }
            currentEdgePoint = pointAhead;
        }

        // TODO remove points from edge points to not repeat again
        return perimeterSum;
    }

    private Optional<FindDirectionResult> findDirection(
            Day12Region region,
            Point edgePoint,
            Direction currentDirection) {
        for (int i = 0; i < 4; i++) {
            Point nextPoint = currentDirection.move(edgePoint);
            if (region.getPoints().contains(nextPoint)) {
                return Optional.of(new FindDirectionResult(currentDirection, nextPoint, i));
            }
            currentDirection = currentDirection.switchClockWise();
        }

        // It will happen when the region is a single point
        return Optional.empty();
    }

    private FindDirectionResult findFirstFencingPoint(
            Day12Region region,
            Point edgePoint) {
        Direction currentDirection = UP;
        for (int i = 0; i < 4; i++) {
            Point nextPoint = currentDirection.move(edgePoint);
            if (!region.getPoints().contains(nextPoint)) {
                return new FindDirectionResult(currentDirection, nextPoint, i);
            }
            currentDirection = currentDirection.switchClockWise();
        }

        throw new IllegalStateException("Didn't find first fencing point");
    }
}
