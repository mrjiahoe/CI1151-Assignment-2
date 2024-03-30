// Create a Board class that represents the game board.
// • Implement a 3x3 grid to store the state of the game.
// • Include methods to:
//      o Initialize the board.
//      o Display the current state of the board.
//      o Check for a winner (if any).

public class Board {
    private char[][] grid;

    public Board() {
        grid = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWinner(char symbol) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) {
                return true;
            }
            if (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) {
                return true;
            }
        }

        // Check diagonals
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) {
            return true;
        }
        if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public boolean markCell(int row, int col, char symbol) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || grid[row][col] != '-') {
            return false;
        }
        grid[row][col] = symbol;
        return true;
    }
}
