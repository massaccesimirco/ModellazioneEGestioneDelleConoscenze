package it.unicam.cs.puzzle15.api.third;

/**
 * This interface is the main interface of the API.
 */
public interface Puzzle15 {

    /**
     * Moves the FreeCell in the specified direction invoking the right method.
     *
     * @param direction the direction in which the FreeCell has to be moved
     *                  (UP, DOWN, LEFT, RIGHT)
     * @param freeCell  the FreeCell to be moved in the specified direction.
     */
    void move(FreeCell freeCell, Directions direction);

    /**
     * Moves the FreeCell up.
     *
     * @param freeCell the FreeCell to be moved up.
     */
    void moveUp(FreeCell freeCell);

    /**
     * Moves the FreeCell down.
     *
     * @param freeCell the FreeCell to be moved down.
     */
    void moveDown(FreeCell freeCell);

    /**
     * Moves the FreeCell left.
     *
     * @param freeCell the FreeCell to be moved left.
     */
    void moveLeft(FreeCell freeCell);

    /**
     * Moves the FreeCell right.
     *
     * @param freeCell the FreeCell to be moved right.
     */
    void moveRight(FreeCell freeCell);

    /**
     * Checks if the puzzle is solved by checking if the shuffleDegree is 0.
     * If the shuffleDegree is 0, the puzzle is solved.
     *
     * @return true if the puzzle is solved, false otherwise.
     */
    boolean isSolved();
}
