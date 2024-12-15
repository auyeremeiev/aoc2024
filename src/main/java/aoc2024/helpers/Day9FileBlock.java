package aoc2024.helpers;

public class Day9FileBlock extends Day9Block {

    private final int fileBlockNumber;

    public Day9FileBlock(int fileBlockNumber, int length) {
        super(Day9BlockType.FILE_BLOCK, length);

        this.fileBlockNumber = fileBlockNumber;
    }

    public int getFileBlockNumber() {
        return fileBlockNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }


        Day9FileBlock that = (Day9FileBlock) o;

        return fileBlockNumber == that.fileBlockNumber;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + fileBlockNumber;
        return result;
    }

    @Override
    public String toString() {
        return "(" + getBlockType() + "," + getFileBlockNumber() + "," + getLength() + ')';
    }
}
