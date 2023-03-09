package it.unicam.cs.puzzle15.api.third;

/**
 * This interface is the main interface of the API.
 */
public interface PuzzleGame {

    /**
     * Shuffles the board.
     */
    void shuffle(int times);

    /**
     * Gets the possible moves of the Cell.
     * The possible moves are the directions in which the Cell can be moved.
     *
     * @return the possible moves of the Cell.
     */
    Directions[] possibleMoves(int x, int y);

    /**
     * Moves the Cell in the specified direction invoking the right method.
     *
     * @param direction the direction in which the FreeCell has to be moved
     *                  (UP, DOWN, LEFT, RIGHT)
     * @param cell      the FreeCell to be moved in the specified direction.
     */
    void move(Cell cell, Directions direction);

    /**
     * Checks if the puzzle is solved by checking if the shuffleDegree is 0.
     * If the shuffleDegree is 0, the puzzle is solved.
     *
     * @return true if the puzzle is solved, false otherwise.
     */
    boolean isSolved();

    /**
     * Gets the board.
     *
     * @return the board.
     */
    Board getBoard();

    /**
     * Gets the Cell.
     *
     * @return the Cell.
     */
    Cell getCell();
}
