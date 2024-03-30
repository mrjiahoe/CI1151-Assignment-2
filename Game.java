// • Create a Game class to manage the Tic Tac Toe game.
// • Include methods to:
//      o Start a new game.
//      o Allow players to take turns marking cells on the board.
//      o Check for a winner after each turn.
//      o Declare the winner or a draw when appropriate.
//      o Prompt players for their moves.
// • Ensure proper encapsulation and error handling.

import java.util.Scanner;

public class Game {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;

    public Game(String player1Name, String player2Name) {
        board = new Board();
        players = new Player[2];
        players[0] = new Player(player1Name, 'X');
        players[1] = new Player(player2Name, 'O');
        currentPlayerIndex = 0;
    }

    public void start() {
        boolean gameEnded = false;
        Player currentPlayer = players[currentPlayerIndex];

        while (!gameEnded) {
            board.displayBoard();
            System.out.println(currentPlayer.getName() + "'s turn");
            boolean validInput = false;
            while (!validInput) {
                @SuppressWarnings("resource")
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter row and column (0-2): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                if (board.markCell(row, col, currentPlayer.getSymbol())) {
                    validInput = true;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            if (board.checkForWinner(currentPlayer.getSymbol())) {
                board.displayBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                gameEnded = true;
            } else if (board.isBoardFull()) {
                board.displayBoard();
                System.out.println("It's a draw!");
                gameEnded = true;
            } else {
                currentPlayerIndex = (currentPlayerIndex + 1) % 2;
                currentPlayer = players[currentPlayerIndex];
            }
        }
    }
}
