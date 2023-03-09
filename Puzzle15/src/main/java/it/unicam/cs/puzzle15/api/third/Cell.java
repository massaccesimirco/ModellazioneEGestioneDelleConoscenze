package it.unicam.cs.puzzle15.api.third;

/**
 * This interface represent the FreeCell.
 * It must be a cell with the number 0, and it must be in the bottom right corner.
 * The following methods must be implemented:
 * <ul>possibleMoves()</ul>
 */
public interface Cell {

    /**
     * Gets the row of the cell.
     *
     * @return the row of the cell.
     */
    public int getRow();

    /**
     * Gets the column of the cell.
     *
     * @return the column of the cell.
     */
    public int getColumn();

    /**
     * Sets the row of the cell.
     *
     * @param x the row of the cell.
     */
    public void setRow(int x);

    /**
     * Sets the column of the cell.
     *
     * @param y the column of the cell.
     */
    public void setColumn(int y);

    /**
     * Gets the value of the cell which must be 0.
     *
     * @return the value of the cell.
     */
    public int getValue();
}
