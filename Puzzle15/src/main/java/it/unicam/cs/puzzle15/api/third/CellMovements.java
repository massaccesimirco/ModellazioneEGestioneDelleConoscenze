package it.unicam.cs.puzzle15.api.third;

/**
 * This interface represent the directions in which the FreeCell can be moved.
 * The following methods must be implemented:
 * <ul>getColumnOffset()</ul>
 * <ul>getRowOffset()</ul>
 */
public enum CellMovements implements Directions {
    UP(-1, 0),
    DOWN(1, 0),
    LEFT(0, -1),
    RIGHT(0, 1);

    private final int rowOffset;
    private final int columnOffset;

    CellMovements(int rowOffset, int columnOffset) {
        this.rowOffset = rowOffset;
        this.columnOffset = columnOffset;
    }

    @Override
    public int getColumnOffset() {
        return columnOffset;
    }

    @Override
    public int getRowOffset() {
        return rowOffset;
    }
}
