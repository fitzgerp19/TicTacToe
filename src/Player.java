import java.util.Scanner;

public class Player {
    private String name = null;
    private int boardValue;

    public Player(String playerName, int value)
    {
        name = playerName;
        boardValue = value;
    }

    public void takeTurn(Board gameBoard)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(name + ": Enter your choice: ");

        // will need to validate choice
        String choice = in.next();
        gameBoard.setChoice(choice, this);
    }

    public int getBoardValue()
    {
        return boardValue;
    }
}
