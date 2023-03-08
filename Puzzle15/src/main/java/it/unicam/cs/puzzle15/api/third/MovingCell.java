package it.unicam.cs.puzzle15.api.third;

public class MovingCell implements Cell {

    /**
     * the size of the board.
     */
    private final int size;

    /**
     * The x coordinate of the FreeCell.
     */
    private final int x;

    /**
     * The y coordinate of the FreeCell.
     */
    private final int y;

    public MovingCell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public Directions[] possibleMoves(int x, int y) {
        Directions[] directions = new Directions[4];

        // the number of possible moves
        int i = 0;

        // if the FreeCell is in the first row, it can't move up
        if (x > 0) {
            directions[i++] = CellMovements.UP;
        }

        // if the FreeCell is in the last row, it can't move down
        if (x < size - 1) {
            directions[i++] = CellMovements.DOWN;
        }

        // if the FreeCell is in the first column, it can't move left
        if (y > 0) {
            directions[i++] = CellMovements.LEFT;
        }

        // if the FreeCell is in the last column, it can't move right
        if (y < size - 1) {
            directions[i++] = CellMovements.RIGHT;
        }

        return directions;
    }

    public int getRow() {
        return x;
    }

    public int getColumn() {
        return y;
    }
}
