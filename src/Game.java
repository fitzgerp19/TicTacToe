public class Game {

    private Board gameBoard = null;
    private Player playerOne = null;
    private Player playerTwo = null;

    private Player winner = null;

    public Game()
    {
        // Start game when creating object
        initialiseGame();
    }

    private void initialiseGame()
    {
        gameBoard = new Board();
        playerOne = new Player("Player 1", 1);
        playerTwo = new Player("Player 2", 2);
    }

    public void runGame()
    {
        int winningValue = -1;
        // game loop

        while (true) {
            // if no choice left end game
            if (gameBoard.isFull())
                break;

            // Player 1 take turn
            playerOne.takeTurn(gameBoard);
            // Check win condition
            winningValue = gameBoard.checkForWin();
            if (winningValue != -1)
                break;

            if (gameBoard.isFull())
                break;

            // Player 2 take turn
            playerTwo.takeTurn(gameBoard);
            // Check win condition
            winningValue = gameBoard.checkForWin();
            if (winningValue != -1)
                break;

            // for testing
            //winner = playerTwo;
            // loop
            if (winner != null)
                break;
        }

        // Print winner
        if (playerOne.getBoardValue() == winningValue)
        {
            System.out.println("Player one wins");
        }
        else if (playerTwo.getBoardValue() == winningValue)
            System.out.println("Player Two wins");
        else
            System.out.println("Draw - no one wins");
    }
}
