package aoc2024;

import aoc2024.common.Direction;
import aoc2024.common.ListUtils;
import aoc2024.common.Pair;
import aoc2024.common.Point;
import aoc2024.helpers.Day12Region;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static aoc2024.common.Direction.UP;
import static aoc2024.common.ListUtils.isBeyoundEdge;

public class Day12 {

    private final List<List<Character>> garden;
    private final int height;
    private final int width;

    public Day12(String input) {
        garden = input.lines().map(it -> it.chars().mapToObj(charc -> (char) charc).toList()).toList();
        height = garden.size();
        width = garden.get(0).size();
    }

    public Long getTask1Result() {
        List<List<Integer>> regionsMap = ListUtils.createMatrix(height, width);

        List<Day12Region> regions = getAllRegions(regionsMap);
        return regions.stream().map(this::calculatePrice).reduce(0L, Long::sum);
    }

    public List<Day12Region> getAllRegions(List<List<Integer>> regionsMap) {
        List<Day12Region> regions = new ArrayList<>();

        int currentRegionId = 1;
        for (int i = 0; i < garden.size(); i++) {
            for (int j = 0; j < garden.get(i).size(); j++) {
                if (regionsMap.get(i).get(j) == 0) {
                    Day12Region newRegion = new Day12Region(currentRegionId, garden.get(i).get(j));
                    exploreRegion(regionsMap, garden, newRegion, i, j);
                    regions.add(newRegion);
                    currentRegionId++;
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

        if (!isBeyoundEdge(garden, new Point(i + 1, j))
                && garden.get(i + 1).get(j) == region.getCharacter() && regionsMap.get(i + 1).get(j) == 0) {
            exploreRegion(regionsMap, garden, region, i + 1, j);
        }

        if (!isBeyoundEdge(garden, new Point(i - 1, j))
                && garden.get(i - 1).get(j) == region.getCharacter() && regionsMap.get(i - 1).get(j) == 0) {
            exploreRegion(regionsMap, garden, region, i - 1, j);
        }

        if (!isBeyoundEdge(garden, new Point(i, j + 1))
                && garden.get(i).get(j + 1) == region.getCharacter() && regionsMap.get(i).get(j + 1) == 0) {
            exploreRegion(regionsMap, garden, region, i, j + 1);
        }

        if (!isBeyoundEdge(garden, new Point(i, j - 1))
                && garden.get(i).get(j - 1) == region.getCharacter() && regionsMap.get(i).get(j - 1) == 0) {
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

    private long calculatePrice(Day12Region region) {
        return calculatePerimeter(region) * region.getPoints().size();
    }

    private long calculatePerimeter(Day12Region region) {
        Set<Point> allEdgePoints = new HashSet<>(region.getEdgePoints());
        return allEdgePoints.stream().map(it -> getFences(region, it)).map(Set::size).reduce(0, Integer::sum);
    }

    private Set<Pair<Point, Point>> getFences(
            Day12Region region,
            Point edgePoint) {
        Direction currentDirection = UP;
        Set<Pair<Point, Point>> fences = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            Point nextPoint = currentDirection.nextPoint(edgePoint);
            if (!region.getPoints().contains(nextPoint)) {
                fences.add(new Pair<>(edgePoint, nextPoint));
            }
            currentDirection = currentDirection.switchClockWise();
        }

        return fences;
    }

//    private Optional<FindDirectionResult> findDirection(
//            Day12Region region,
//            Point edgePoint,
//            Direction currentDirection) {
//        currentDirection = currentDirection.switchCounterClockWise();
//        for (int i = 0; i < 4; i++) {
//            Point nextPoint = currentDirection.nextPoint(edgePoint);
//            if (region.getPoints().contains(nextPoint)) {
//                return Optional.of(new FindDirectionResult(currentDirection, nextPoint, i));
//            }
//            currentDirection = currentDirection.switchClockWise();
//        }
//
//        // It will happen when the region is a single point
//        return Optional.empty();
//    }
//
//    private FindDirectionResult findFirstFencingPoint(
//            Day12Region region,
//            Point edgePoint) {
//        Direction currentDirection = UP;
//        for (int i = 0; i < 4; i++) {
//            Point nextPoint = currentDirection.nextPoint(edgePoint);
//            if (!region.getPoints().contains(nextPoint)) {
//                return new FindDirectionResult(currentDirection, nextPoint, i);
//            }
//            currentDirection = currentDirection.switchClockWise();
//        }
//
//        throw new IllegalStateException("Didn't find first fencing point. The point is not in the edge");
//    }
}
