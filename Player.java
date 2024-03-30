// Create a Player class to represent a player in the game.
// • Each player should have a name and a symbol (X or O).
// • Implement appropriate constructors and methods.

public class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
