package it.unicam.cs.puzzle15.api.third;

public class MovingCell implements Cell {

    /**
     * The size of the board.
     */
    private final int size;
    /**
     * The x coordinate of the FreeCell.
     */
    private int x;
    /**
     * The y coordinate of the FreeCell.
     */
    private int y;

    public MovingCell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public int getRow() {
        return x;
    }

    @Override
    public void setRow(int x) {
        this.x = x;
    }

    @Override
    public int getColumn() {
        return y;
    }

    @Override
    public void setColumn(int y) {
        this.y = y;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public int getDisorderDegree(int n) {

        // |rg - rc| + |cg - cc|
        return Math.abs(getRow() - (n - 1) / this.size) + Math.abs(getColumn() - (n - 1) % this.size);
    }
}
