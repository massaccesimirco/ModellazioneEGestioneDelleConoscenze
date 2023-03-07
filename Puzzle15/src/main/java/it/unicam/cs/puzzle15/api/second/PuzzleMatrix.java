package it.unicam.cs.puzzle15.api.second;

import java.util.Random;

/**
 * This class represents the matrix of the puzzle.
 *
 * @author Matteo Machella
 */
public class PuzzleMatrix {

    /**
     * Default size of the matrix.
     */
    public static final int DEFAULT_SIZE = 4;

    /**
     * The matrix of the puzzle.
     */
    private final int[][] matrix;

    /**
     * The size of the matrix.
     */
    private final int size;

    /**
     * The position of the moving cell.
     */
    private Position movingCellPosition;

    /**
     * Creates a new matrix of the puzzle with the default size.
     */
    public PuzzleMatrix() {
        this(DEFAULT_SIZE);
    }

    /**
     * Creates a new matrix of the puzzle with the specified size.
     *
     * @param size the size of the matrix
     */
    public PuzzleMatrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];

        reset();
    }

    /**
     * Resets the matrix.
     */
    private void reset() {
        int value = 1;

        // Fill the matrix with the values from 1 to size^2 - 1
        for (int row = 0; row < this.size; row++) {
            for (int column = 0; column < this.size; column++) {
                this.matrix[row][column] = value++;
            }
        }

        // Set the last cell to 0
        this.matrix[this.size - 1][this.size - 1] = 0;
        this.movingCellPosition = new Position(this.size);
    }

    /**
     * Moves the moving cell in the specified direction.
     *
     * @param direction the direction of the movement
     * @return true if the movement is valid
     * @throws IllegalArgumentException if the movement is invalid
     */
    public boolean move(CellMovement direction) {

        // Get the position of the cell to move
        Position position = this.movingCellPosition.getPosition(direction);

        // Check if the position is valid
        if (!position.isValid()) {
            return false;
        }

        // Move the cell in the specified direction and update the position of the moving cell
        this.matrix[this.movingCellPosition.getRow()][this.movingCellPosition.getColumn()] = this.matrix[position.getRow()][position.getColumn()];
        this.matrix[position.getRow()][position.getColumn()] = 0;
        this.movingCellPosition = position;

        return true;
    }

    /**
     * Shuffles the matrix.
     *
     * @param times the number of times to shuffle the matrix
     *              (the higher the number, the more shuffled the matrix will be)
     */
    public void shuffle(int times) {
        shuffle(new Random(), times);
    }

    /**
     * Shuffles the matrix with the specified random object.
     *
     * @param random the random object to use
     *               (the higher the number, the more shuffled the matrix will be)
     * @param times  the number of times to shuffle the matrix
     *               (the higher the number, the more shuffled the matrix will be)
     */
    public void shuffle(Random random, int times) {
        for (int i = 0; i < times; i++) {
            move(CellMovement.getRandom(random));
        }
    }

    /**
     * Returns the enabled moves.
     * The enabled moves are the moves that can be performed on the matrix.
     *
     * @return the enabled moves
     */
    public CellMovement[] enabledMoves() {
        return this.movingCellPosition.enabledMoves();
    }

    /**
     * Checks if the matrix is empty.
     * The matrix is empty if the moving cell is in the last position.
     *
     * @return true if the matrix is empty
     */
    public boolean isEmpty() {

        // Check if the moving cell is in the last position
        return this.matrix[this.size - 1][this.size - 1] == 0;
    }

    /**
     * Checks if the matrix is solved.
     * The matrix is solved if the moving cell is in the last position and all the other cells are in the correct position.
     *
     * @return true if the matrix is solved
     */
    public boolean isSolved() {

        // Check if the matrix is empty
        if (!isEmpty()) {
            return false;
        }

        // Check if all the other cells are in the correct position
        int value = 1;
        for (int row = 0; row < this.size; row++) {
            for (int column = 0; column < this.size; column++) {
                if (this.matrix[row][column] != value++ && (row != this.size - 1 || column != this.size - 1)) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Returns the value of the cell in the specified position.
     *
     * @param row    the row of the cell
     * @param column the column of the cell
     * @return the value of the cell
     */
    public int getValue(int row, int column) {
        return this.matrix[row][column];
    }

    /**
     * Returns the value of the cell in the specified position.
     *
     * @param position the position of the cell
     */
    public void set(Position position, int value) {
        this.matrix[position.getRow()][position.getColumn()] = value;
    }

    /**
     * Returns the size of the matrix.
     *
     * @return the size of the matrix
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Returns the position of the moving cell.
     *
     * @return the position of the moving cell
     */
    public Position getMovingCellPosition() {
        return this.movingCellPosition;
    }

    /**
     * Returns the matrix of the puzzle.
     *
     * @return the matrix of the puzzle
     */
    public int[][] getMatrix() {
        return this.matrix;
    }

    /**
     * Returns the string representation of the matrix.
     *
     * @return the string representation of the matrix
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int row = 0; row < this.size; row++) {
            for (int column = 0; column < this.size; column++) {
                builder.append(this.matrix[row][column]).append(" ");
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}
