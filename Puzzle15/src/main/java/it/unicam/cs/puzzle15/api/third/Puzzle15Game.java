package it.unicam.cs.puzzle15.api.third;

import java.util.Random;

import static it.unicam.cs.puzzle15.api.second.PuzzleMatrix.DEFAULT_SIZE;
import static it.unicam.cs.puzzle15.api.third.CellMovements.*;

public class Puzzle15Game implements PuzzleGame {

    /**
     * The board of the game.
     */
    private final Board board;

    /**
     * The moving cell of the game.
     */
    private final Cell movingCell;

    /**
     * The size of the board.
     */
    private final int size;

    /**
     * Create a new game with the default size.
     */
    public Puzzle15Game() {
        this(DEFAULT_SIZE);
    }

    /**
     * Create a new game with the given size.
     *
     * @param size the size of the board.
     */
    public Puzzle15Game(int size) {
        this.size = size;
        this.board = new Puzzle15Board(size);
        this.movingCell = new MovingCell(size - 1, size - 1);
    }

    @Override
    public void shuffle(int times) {

        // shuffle the board
        shuffle(new Random(), times);
    }

    public void shuffle(Random random, int times) {

        // shuffle the board
        for (int i = 0; i < times; i++) {
            int x = random.nextInt(size);
            int y = random.nextInt(size);
            Directions[] directions = possibleMoves(x, y);
            int index = random.nextInt(directions.length);
            Directions direction = directions[index];
            move(new MovingCell(x, y), direction);
        }
    }

    @Override
    public Directions[] possibleMoves(int x, int y) {

        // the possible moves
        Directions[] directions = new Directions[4];

        // the number of possible moves
        int i = 0;

        // if the FreeCell is in the first row, it can't move up
        if (x > 0) {
            directions[i++] = UP;
        }

        // if the FreeCell is in the last row, it can't move down
        if (x < size - 1) {
            directions[i++] = DOWN;
        }

        // if the FreeCell is in the first column, it can't move left
        if (y > 0) {
            directions[i++] = LEFT;
        }

        // if the FreeCell is in the last column, it can't move right
        if (y < size - 1) {
            directions[i++] = CellMovements.RIGHT;
        }

        return directions;
    }

    @Override
    public void move(Cell cell, Directions direction) {

        // swap the moving cell with the cell in the specified direction
        board.swap(direction, cell.getRow(), cell.getColumn());
    }

//    @Override
//    public void moveUp(Directions direction) {
//
//        // swap the moving cell with the cell in the specified direction
//        board.swap(direction, movingCell.getRow(), movingCell.getColumn());
//    }
//
//    @Override
//    public void moveDown(Directions direction) {
//
//        // swap the moving cell with the cell in the specified direction
//        board.swap(direction, movingCell.getRow(), movingCell.getColumn());
//    }
//
//    @Override
//    public void moveLeft(Directions direction) {
//
//        // swap the moving cell with the cell in the specified direction
//        board.swap(direction, movingCell.getRow(), movingCell.getColumn());
//    }
//
//    @Override
//    public void moveRight(Directions direction) {
//
//        // swap the moving cell with the cell in the specified direction
//        board.swap(direction, movingCell.getRow(), movingCell.getColumn());
//    }

    @Override
    public boolean isSolved() {
        return board.isSolved();
    }
}
