package it.unicam.cs.puzzle15.api.third;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask the user for the board size
        System.out.print("Enter the size of the board: ");
        int size = scanner.nextInt();

        // create a new game
        PuzzleGame game = new Puzzle15Game(size);

        // shuffle the board
        game.shuffle(100);

        while (true) {
            // print the board
            System.out.println(game.getBoard());

            // check if the game is solved
            if (game.isSolved()) {
                System.out.println("You won!");
                break;
            }

            // ask the user for the next move
            System.out.print("Enter your next move (up, down, left, right): ");
            String input = scanner.next().toLowerCase();

            // parse the input
            Directions direction;
            switch (input) {
                case "up" -> direction = CellMovements.UP;
                case "down" -> direction = CellMovements.DOWN;
                case "left" -> direction = CellMovements.LEFT;
                case "right" -> direction = CellMovements.RIGHT;
                default -> {
                    System.out.println("Invalid input.");
                    continue;
                }
            }

            // move the cell
            game.move(game.getCell(), direction);
        }
    }
}