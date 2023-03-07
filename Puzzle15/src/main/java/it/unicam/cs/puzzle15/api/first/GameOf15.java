package it.unicam.cs.puzzle15.api.first;

/**
 * Game of 15 is a puzzle game played on a 4x4 grid with the numbers 1 through 15.
 * The goal is to arrange the numbers sequentially from left to right, top to bottom.
 * The player can slide one tile at a time, either horizontally or vertically, into the empty space.
 * The game is won when the numbers are arranged in sequential order.
 */
public class GameOf15 {

    // Matrix of the game board
    BoardMatrix boardMatrix;

    // Constructor of the class mgc.giocodel15.first.time.api.GameOf15
    public GameOf15(int n) {

        // Initialize the matrix of the game board with the size n x n
        this.boardMatrix = new BoardMatrix(n);
    }

    /**
     * Returns the matrix of the game board.
     *
     * @return matrix of the game board
     */
    public int[][] getMatrix() {
        return this.boardMatrix.getMatrix();
    }

    /**
     * Verifies if the number is valid.
     *
     * @param number number to be verified
     * @return true if the number is valid, false otherwise
     */
    private boolean isValidNumber(int number) {
        return number > 0 && number < this.boardMatrix.getMatrix().length * this.boardMatrix.getMatrix().length;
    }

    /**
     * Moves the number in the matrix in the free cell (0).
     *
     * @param number number to be moved
     * @throws IllegalArgumentException if the number is not valid
     */
    public void moveNumber(int number) {

        // Verify if the number is valid
        if (!isValidNumber(number)) {
            throw new IllegalArgumentException("The number must be between 0 and " + (this.boardMatrix.getMatrix().length * this.boardMatrix.getMatrix().length - 1) + "!");
        }

        // Find the position of the number in the matrix
        int[] position = findNumberPosition(number);
        moveNumberInFreeCell(position);
    }

    /**
     * Finds the position of the number in the matrix.
     *
     * @param number number to be found
     * @return position of the number in the matrix
     * @throws IllegalStateException if the number is not in the matrix
     */
    private int[] findNumberPosition(int number) {

        // Find the position of the number in the matrix
        for (int i = 0; i < this.boardMatrix.getMatrix().length; i++) {
            for (int j = 0; j < this.boardMatrix.getMatrix()[i].length; j++) {
                if (this.boardMatrix.getMatrix()[i][j] == number) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalStateException("The number must be in the matrix!");
    }

    /**
     * Moves the number in the matrix in the free cell (0).
     *
     * @param position position of the number in the matrix
     */
    private void moveNumberInFreeCell(int[] position) {
        int row = position[0];
        int column = position[1];

        if (column + 1 < this.boardMatrix.getMatrix()[row].length && this.boardMatrix.getMatrix()[row][column + 1] == 0) {
            this.boardMatrix.getMatrix()[row][column + 1] = this.boardMatrix.getMatrix()[row][column];
            this.boardMatrix.getMatrix()[row][column] = 0;
        } else if (column - 1 >= 0 && this.boardMatrix.getMatrix()[row][column - 1] == 0) {
            this.boardMatrix.getMatrix()[row][column - 1] = this.boardMatrix.getMatrix()[row][column];
            this.boardMatrix.getMatrix()[row][column] = 0;
        } else if (row + 1 < this.boardMatrix.getMatrix().length && this.boardMatrix.getMatrix()[row + 1][column] == 0) {
            this.boardMatrix.getMatrix()[row + 1][column] = this.boardMatrix.getMatrix()[row][column];
            this.boardMatrix.getMatrix()[row][column] = 0;
        } else if (row - 1 >= 0 && this.boardMatrix.getMatrix()[row - 1][column] == 0) {
            this.boardMatrix.getMatrix()[row - 1][column] = this.boardMatrix.getMatrix()[row][column];
            this.boardMatrix.getMatrix()[row][column] = 0;
        }
    }
}
