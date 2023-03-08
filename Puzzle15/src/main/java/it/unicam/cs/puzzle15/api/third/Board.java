package it.unicam.cs.puzzle15.api.third;

/**
 * This interface represent the board of the puzzle. It must be a grid of cells.
 * It must be filled with numbers from 1 to size^2 - 1 and a FreeCell.
 * The FreeCell must be in the bottom right corner.
 * The attribute shuffleDegree must be initialized to 0.
 * The following methods must be implemented:
 * <ul>fillBoard()</ul>
 * <ul>shuffle()</ul>
 */
public interface Board {

    /**
     * Fills the board with numbers from 1 to size^2 - 1 and a FreeCell.
     * The FreeCell must be in the bottom right corner.
     * The attribute shuffleDegree must be initialized to 0.
     *
     * @param size the size of the board.
     *             The board must be a grid of cells.
     */
    void fillBoard(int size);

    /**
     * Shuffles the board.
     * The attribute shuffleDegree must be incremented by 1.
     */
    void shuffle(int times);

    /**
     * Returns the size of the board.
     *
     * @return the size of the board.
     */
    int getSize();

    /**
     * Returns the shuffleDegree of the board.
     *
     * @return the shuffleDegree of the board.
     */
    int getShuffleDegree();
}
