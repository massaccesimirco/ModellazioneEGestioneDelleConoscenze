package it.unicam.cs.puzzle15.api.first;

import java.util.Random;

/**
 * Class which represents the board matrix of the game.
 * The matrix is initialized with the numbers from 0 to n^2.
 * The numbers are randomly placed in the matrix.
 * The numbers are randomly extracted from the array of numbers.
 */
public class BoardMatrix {

    // Matrix of the game board
    private final int[][] matrice;

    // Array of numbers to be used in the matrix of the game
    Numbers numbers;

    // Constructor of the class mgc.giocodel15.first.time.api.BoardMatrix
    public BoardMatrix(int n) {

        // Initialize the matrix of the game board with the size n x n
        this.matrice = new int[n][n];

        // Initialize the array of numbers to be used in the matrix of the game
        this.numbers = new Numbers(n);

        // Fill the matrix with the numbers
        matrixFill();
    }

    /**
     * Generates a random number between 0 and n^2-1.
     * If the random number has already been extracted, generates a new random number.
     * Inserts the random number in the matrix.
     * Delete extracted number from the array of numbers.
     */
    private void matrixFill() {

        // Generate a random number
        Random random = new Random();
        int randomNumber;

        // Fill the matrix
        for (int i = 0; i < this.matrice.length; i++) {
            for (int j = 0; j < this.matrice[i].length; j++) {

                // Generate a random number
                randomNumber = random.nextInt(this.numbers.getNumbers().length);

                // If the random number has already been extracted, generates a new random number
                while (this.numbers.getNumbers()[randomNumber] == -1) {
                    randomNumber = random.nextInt(this.numbers.getNumbers().length);
                }

                // Inserts the random number in the matrix
                this.matrice[i][j] = this.numbers.getNumbers()[randomNumber];

                // Marks the number as extracted
                this.numbers.getNumbers()[randomNumber] = -1;
            }
        }
    }

    /**
     * Returns the matrix of the game board.
     *
     * @return matrix of the game board
     */
    public int[][] getMatrix() {
        return this.matrice;
    }
}
