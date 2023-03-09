package it.unicam.cs.puzzle15.api.third;

public class MovingCell implements Cell {

    /**
     * The x coordinate of the FreeCell.
     */
    private int x;

    /**
     * The y coordinate of the FreeCell.
     */
    private int y;

    public MovingCell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getRow() {
        return x;
    }

    @Override
    public int getColumn() {
        return y;
    }

    @Override
    public void setRow(int x) {
        this.x = x;
    }

    @Override
    public void setColumn(int y) {
        this.y = y;
    }

    @Override
    public int getValue() {
        return 0;
    }
}
