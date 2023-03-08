package it.unicam.cs.puzzle15.api.third;

/**
 * This interface represent the FreeCell.
 * It must be a cell with the number 0, and it must be in the bottom right corner.
 * The following methods must be implemented:
 * <ul>possibleMoves()</ul>
 */
public interface FreeCell {

    /**
     * Gets the possible moves of the FreeCell.
     * The possible moves are the directions in which the FreeCell can be moved.
     *
     * @return the possible moves of the FreeCell.
     */
    Directions[] possibleMoves();
}
