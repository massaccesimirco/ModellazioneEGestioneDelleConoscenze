package it.unicam.cs.puzzle15.api.third;

public class Puzzle15Board implements Board {

    /**
     * The default size of the board.
     */
    private static final int DEFAULT_SIZE = 4;

    /**
     * The board of the game.
     */
    private final int[][] board;

    /**
     * The size of the board.
     */
    private final int size;

    /**
     * The moving cell of the game.
     */
    private MovingCell movingCell;

    /**
     * The shufflingDegree is used to determine the shufflingDisorder() of the board.
     * The higher the shufflingDegree, the more the board will be shuffled.
     * If the shufflingDegree is 0, the board is in a starting position, or it is solved.
     */
    private int shufflingDegree;

    /**
     * Create a new board with the default size.
     */
    public Puzzle15Board() {
        this(DEFAULT_SIZE);
    }

    /**
     * Create a new board with the given size.
     *
     * @param size the size of the board.
     */
    public Puzzle15Board(int size) {

        // set the size of the board
        this.size = size;

        // create the board
        this.board = new int[size][size];

        // fill the board
        fillBoard(size);
    }

    @Override
    public void fillBoard(int size) {

        // set the shuffling degree to 0
        this.shufflingDegree = 0;

        // fill the board with numbers from 1 to size^2 - 1
        int number = 1;
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                this.board[row][column] = number++;
            }
        }

        // set the moving cell
        this.movingCell = new MovingCell(size - 1, size - 1, size);

        // set the last cell to 0
        this.board[size - 1][size - 1] = movingCell.getValue();
    }

    public void swap(Directions direction, Cell movingCell) {

        // swap the cell in the given position with the Cell
        int tmp = this.board[movingCell.getRow()][movingCell.getColumn()];
        this.board[movingCell.getRow()][movingCell.getColumn()] = this.board[movingCell.getRow() + direction.getRowOffset()][movingCell.getColumn() + direction.getColumnOffset()];
        this.board[movingCell.getRow() + direction.getRowOffset()][movingCell.getColumn() + direction.getColumnOffset()] = tmp;

        // update the shuffling degree
        this.shufflingDegree = this.shufflingDegree
                - movingCell.getDisorderDegree(this.board[movingCell.getRow()][movingCell.getColumn()]
                + movingCell.getDisorderDegree(this.board[movingCell.getRow()
                + direction.getRowOffset()][movingCell.getColumn()
                + direction.getColumnOffset()]));

        // update the moving cell
        this.movingCell.setRow(movingCell.getRow() + direction.getRowOffset());
        this.movingCell.setColumn(movingCell.getColumn() + direction.getColumnOffset());
    }

    @Override
    public boolean isSolved() {

        /*
         * The board is solved if the shuffling degree is 0.
         * The shuffling degree is 0 if the board is in a starting position, or it is solved.
         */
        return this.shufflingDegree == 0;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
