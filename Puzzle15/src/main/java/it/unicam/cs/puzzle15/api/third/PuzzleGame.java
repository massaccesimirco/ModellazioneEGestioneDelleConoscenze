package it.unicam.cs.puzzle15.api.third;

/**
 * This interface is the main interface of the API.
 */
public interface PuzzleGame {

    /**
     * Shuffles the board.
     * The attribute shuffleDegree must be incremented by 1.
     */
    void shuffle(int times);

    /**
     * Gets the possible moves of the FreeCell.
     * The possible moves are the directions in which the FreeCell can be moved.
     *
     * @return the possible moves of the FreeCell.
     */
    Directions[] possibleMoves(int x, int y);

    /**
     * Moves the FreeCell in the specified direction invoking the right method.
     *
     * @param direction the direction in which the FreeCell has to be moved
     *                  (UP, DOWN, LEFT, RIGHT)
     * @param cell  the FreeCell to be moved in the specified direction.
     */
    void move(Cell cell, Directions direction);

//    /**
//     * Moves the Cell up.
//     *
//     * @param direction the direction in which the Cell has to be moved
//     */
//    void moveUp(Directions direction);
//
//    /**
//     * Moves the Cell down.
//     *
//     * @param direction the direction in which the Cell has to be moved
//     */
//    void moveDown(Directions direction);
//
//    /**
//     * Moves the Cell left.
//     *
//     * @param direction the direction in which the Cell has to be moved
//     */
//    void moveLeft(Directions direction);
//
//    /**
//     * Moves the Cell right.
//     *
//     * @param direction the direction in which the Cell has to be moved
//     */
//    void moveRight(Directions direction);

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
