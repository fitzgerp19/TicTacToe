/*
    Game board for Tic Tac Toe. (3 by 3)
 */
public class Board {
    int [][] gameBoard = new int[][]{{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};

    public boolean isFull()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (gameBoard[i][j] == -1)
                    return false;
            }
        }

        return true;
    }

    public void setChoice(String choice, Player currentPlayer)
    {
        // C2, A1, B3
        // A = 1, B = 2, C =3
        int row, column;

        // subtract to convert to array index

        switch (choice.charAt(0)) {
            case 'A':
                row = 0;
                break;
            case 'B':
                row = 1;
                break;
            case 'C':
                row = 2;
                break;
            default:
                row = -1;
        }

        column = Integer.parseInt(String.valueOf(choice.charAt(1))) - 1;

        //System.out.println(choice + " " + row + " " + column);

        if (gameBoard[row][column] == -1)
            gameBoard[row][column] = currentPlayer.getBoardValue();
    }

    /*
        Check board to see if there is a winner.
        Return winning value.
     */
    public int checkForWin()
    {
        // Check rows
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 1; j++)
            {
                if ((gameBoard[i][j] == gameBoard[i][j+1]) && (gameBoard[i][j] == gameBoard[i][j+2]))
                {
                    // row is the same
                    // return winner
                    return gameBoard[i][j];
                }
            }
        }

        // Check columns
        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if ((gameBoard[i][j] == gameBoard[i+1][j]) && (gameBoard[i][j] == gameBoard[i+2][j]))
                {
                    // column is the same
                    // return winner
                    return gameBoard[i][j];
                }
            }
        }

        // Check diagonals

        // no win
        return -1;
    }
}
