package it.unicam.cs.puzzle15.api.third;

/**
 * This interface is the main interface of the API.
 */
public interface PuzzleGame {

    /**
     * Moves the FreeCell in the specified direction invoking the right method.
     *
     * @param direction the direction in which the FreeCell has to be moved
     *                  (UP, DOWN, LEFT, RIGHT)
     * @param cell  the FreeCell to be moved in the specified direction.
     */
    void move(Cell cell, Directions direction);

    /**
     * Moves the FreeCell up.
     *
     * @param cell the FreeCell to be moved up.
     */
    void moveUp(Cell cell);

    /**
     * Moves the FreeCell down.
     *
     * @param cell the FreeCell to be moved down.
     */
    void moveDown(Cell cell);

    /**
     * Moves the FreeCell left.
     *
     * @param cell the FreeCell to be moved left.
     */
    void moveLeft(Cell cell);

    /**
     * Moves the FreeCell right.
     *
     * @param cell the FreeCell to be moved right.
     */
    void moveRight(Cell cell);

    /**
     * Checks if the puzzle is solved by checking if the shuffleDegree is 0.
     * If the shuffleDegree is 0, the puzzle is solved.
     *
     * @return true if the puzzle is solved, false otherwise.
     */
    boolean isSolved();
}
