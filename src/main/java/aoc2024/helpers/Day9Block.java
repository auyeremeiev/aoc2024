package aoc2024.helpers;

public class Day9Block {
    private final Day9BlockType blockType;
    private final int length;

    public Day9Block(Day9BlockType blockType, int length) {
        this.blockType = blockType;
        this.length = length;
    }

    public Day9BlockType getBlockType() {
        return blockType;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }


        Day9Block day9Block = (Day9Block) o;

        if (length != day9Block.length) {
            return false;
        }
        return blockType == day9Block.blockType;
    }

    @Override
    public int hashCode() {
        int result = blockType != null ? blockType.hashCode() : 0;
        result = 31 * result + length;
        return result;
    }

    @Override
    public String toString() {
        return "(" + blockType + "," + length + ')';
    }
}
