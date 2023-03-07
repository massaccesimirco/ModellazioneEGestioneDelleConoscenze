package it.unicam.cs.puzzle15.api.first;

/**
 * This class represents an array of numbers to be used in the matrix of the game.
 * The array is initialized with the numbers from 0 to n^2.
 */
public class Numbers {

    private final int[] numbers;

    public Numbers(int n) {

        // Initialize the array of numbers with the numbers from 0 to n^2
        this.numbers = new int[n * n];

        for (int i = 0; i < this.numbers.length; i++) {
            this.numbers[i] = i;
        }
    }

    /**
     * Returns the array of numbers.
     *
     * @return array of numbers
     */
    public int[] getNumbers() {
        return this.numbers;
    }
}
