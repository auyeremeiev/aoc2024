package aoc2024;

import aoc2024.common.Pair;

public class Task6TripResult {

    public static enum Task6BumpType {
        OBSTACLE,
        END_OF_FIELD
    };

    private Pair<Integer, Integer> nextPoint;
    private Task6BumpType bumpType;

    public Task6TripResult(Pair<Integer, Integer> nextPoint, Task6BumpType bumpType) {
        this.nextPoint = nextPoint;
        this.bumpType = bumpType;
    }

    public Pair<Integer, Integer> getNextPoint() {
        return nextPoint;
    }

    public Task6BumpType getBumpType() {
        return bumpType;
    }
}
