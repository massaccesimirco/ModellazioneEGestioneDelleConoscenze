package it.unicam.cs.puzzle15.api.third;

/**
 * This interface represent the directions.
 * It must be an enum with the following values:
 * <ul>UP</ul>
 * <ul>DOWN</ul>
 * <ul>LEFT</ul>
 * <ul>RIGHT</ul>
 * The following methods must be implemented:
 * possibleMoves()
 * getOffset()
 */
public interface Directions {

    /**
     * Gets the offset of the column.
     *
     * @return the offset of the column.
     */
    int getColumnOffset();

    /**
     * Gets the offset of the row.
     *
     * @return the offset of the row.
     */
    int getRowOffset();
}
