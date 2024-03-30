// The objective of this assignment is to assess students' understanding of Object-Oriented
// Programming (OOP) concepts in Java, including class design, inheritance, encapsulation, and
// polymorphism. Students will implement a simple Tic Tac Toe game where two players can take
// turns to mark cells on a 3x3 grid.

import java.util.Scanner;

public class TestTicTacToe {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();
        System.out.print("Enter Player 2 name: ");
        String player2Name = scanner.nextLine();

        Game game = new Game(player1Name, player2Name);
        game.start();

    }
}
