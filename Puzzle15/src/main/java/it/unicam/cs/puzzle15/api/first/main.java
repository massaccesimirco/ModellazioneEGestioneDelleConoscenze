package it.unicam.cs.puzzle15.api.first;

/**
 * Test if the Game of 15 is solved.
 */
public class main {

    public static void main(String[] args) {

        // Initialize the game
        GameOf15 game = new GameOf15(4);

        // Print the matrix of the game board
        System.out.println("Matrix of the game board:");
        for (int i = 0; i < game.getMatrix().length; i++) {
            for (int j = 0; j < game.getMatrix()[i].length; j++) {
                System.out.print(game.getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Move the number 1 in the free cell (0)
        game.moveNumber(1);

        // Print the matrix of the game board
        System.out.println("Matrix of the game board:");
        for (int i = 0; i < game.getMatrix().length; i++) {
            for (int j = 0; j < game.getMatrix()[i].length; j++) {
                System.out.print(game.getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Move the number 2 in the free cell (0)
        game.moveNumber(2);

        // Print the matrix of the game board
        System.out.println("Matrix of the game board:");
        for (int i = 0; i < game.getMatrix().length; i++) {
            for (int j = 0; j < game.getMatrix()[i].length; j++) {
                System.out.print(game.getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Move the number 3 in the free cell (0)
        game.moveNumber(3);

        // Print the matrix of the game board
        System.out.println("Matrix of the game board:");
        for (int i = 0; i < game.getMatrix().length; i++) {
            for (int j = 0; j < game.getMatrix()[i].length; j++) {
                System.out.print(game.getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Move the number 4 in the free cell (0)
        game.moveNumber(4);

        // Print the matrix of the game board
        System.out.println("Matrix of the game board:");

        for (int i = 0; i < game.getMatrix().length; i++) {
            for (int j = 0; j < game.getMatrix()[i].length; j++) {
                System.out.print(game.getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
