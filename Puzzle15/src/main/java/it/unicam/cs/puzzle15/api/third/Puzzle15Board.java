package it.unicam.cs.puzzle15.api.third;

import java.util.Random;

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
     * The shuffle degree of the board.
     */
    private int shuffleDegree;

    /**
     * The MovingCell of the board.
     */
    private MovingCell movingCell;

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
        this.size = size;
        this.board = new int[size][size];
        this.shuffleDegree = 0;
        fillBoard(size);
    }

    @Override
    public void fillBoard(int size) {

        // fill the board with numbers from 1 to size^2 - 1
        int number = 1;
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                this.board[row][column] = number++;
            }
        }

        // set the MovingCell in the bottom right corner
        this.movingCell = new MovingCell(size - 1, size - 1, size);

        // set the last cell to 0
        this.board[size - 1][size - 1] = 0;
    }

    @Override
    public void shuffle(int times) {

        // increment the shuffle degree
        this.shuffleDegree++;

        // shuffle the board
        shuffle(new Random(), times);
    }

    public void shuffle(Random random, int times) {
        for (int i = 0; i < times; i++) {
            Directions[] directions = this.movingCell.possibleMoves(this.movingCell.getRow(), this.movingCell.getColumn());
            int randomIndex = random.nextInt(directions.length);
            Directions direction = directions[randomIndex];
//            move(direction);
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int getShuffleDegree() {
        return this.shuffleDegree;
    }
}
