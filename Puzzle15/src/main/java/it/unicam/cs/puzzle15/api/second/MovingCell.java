package it.unicam.cs.puzzle15.api.second;

import java.util.Random;

/**
 * This enum represents the moving cell.
 *
 * @author Matteo Machella
 */
public enum MovingCell {
    UP(-1, 0), DOWN(1, 0), LEFT(0, -1), RIGHT(0, 1);

    private final int rowOffset;
    private final int columnOffset;

    MovingCell(int rowOffset, int columnOffset) {
        this.rowOffset = rowOffset;
        this.columnOffset = columnOffset;
    }

    /**
     * Returns a random moving cell.
     *
     * @return a random moving cell
     */
    public static MovingCell getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    public static MovingCell getRandom(Random random) {
        return values()[random.nextInt(values().length)];
    }


    public int getRowOffset() {
        return rowOffset;
    }

    public int getColumnOffset() {
        return columnOffset;
    }
}
