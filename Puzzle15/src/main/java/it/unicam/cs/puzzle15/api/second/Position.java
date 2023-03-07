package it.unicam.cs.puzzle15.api.second;

/**
 * This class represents the position of a cell in the matrix.
 *
 * @author Matteo Machella
 */
public class Position {

    /**
     * The row of the position of the moving cell.
     */
    private final int row;

    /**
     * The column of the position of the moving cell.
     */
    private final int column;

    /**
     * The size of the matrix.
     */
    private final int size;

    /**
     * Creates a new position.
     *
     * @param row    the row of the position
     * @param column the column of the position
     * @param size   the size of the matrix
     */
    public Position(int row, int column, int size) {
        this.row = row;
        this.column = column;
        this.size = size;
    }

    /**
     * Creates a new position with the specified size.
     *
     * @param size the size of the matrix
     */
    public Position(int size) {
        this(size - 1, size - 1, size);
    }

    /**
     * Returns the row of the position.
     *
     * @return the row of the position
     */
    public int getRow() {
        return row;
    }

    /**
     * Returns the column of the position.
     *
     * @return the column of the position
     */
    public int getColumn() {
        return column;
    }

    /**
     * Returns the size of the matrix.
     *
     * @return the size of the matrix
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns the position of the cell in the specified direction.
     *
     * @param movingCell the moving cell
     * @return the position of the cell in the specified direction
     */
    public Position movingCellPosition(MovingCell movingCell) {
        return new Position(row + movingCell.getRowOffset(), column + movingCell.getColumnOffset(), size);
    }

    /**
     * Returns the enabled moves.
     *
     * @return the enabled moves
     */
    public MovingCell[] enabledMoves() {

        // The maximum number of moves is 4
        MovingCell[] moves = new MovingCell[4];

        // The index of the moves array to be filled with the enabled moves
        int index = 0;

        // Check if the moving cell can move up and add the move to the array if it can move up
        if (row > 0) {
            moves[index++] = MovingCell.UP;
        }

        // Check if the moving cell can move down and add the move to the array if it can move down
        if (row < size - 1) {
            moves[index++] = MovingCell.DOWN;
        }

        // Check if the moving cell can move left and add the move to the array if it can move left
        if (column > 0) {
            moves[index++] = MovingCell.LEFT;
        }

        // Check if the moving cell can move right and add the move to the array if it can move right
        if (column < size - 1) {
            moves[index++] = MovingCell.RIGHT;
        }

        return moves;
    }
}
