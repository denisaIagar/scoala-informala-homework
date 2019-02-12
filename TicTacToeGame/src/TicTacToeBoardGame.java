import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeBoardGame {
    private char [] [] gameBoard;
    private  boolean gameOnGoing = true;

    /**
     * This is the constructor for the GameBoard class
     */

    public TicTacToeBoardGame(){
        gameBoard = new char[3][3];

        for ( int row = 0; row < gameBoard.length; row ++)
        {
            Arrays.fill(gameBoard[row], ' ');

        }

    }
/**
 * this method will display the board on the console
 */
    public  void  displayBoard() {
        int row;
        for (row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[0].length; col++) {
                System.out.print("\t" + gameBoard[row][col]);
                if (col == 0 || col == 1)
                    System.out.print("|");
            }
            if (row == 0 || row == 1) {
                System.out.print("\n------------------\n");
            } else {
                System.out.println("\n");
            }
        }
    }
    /**
     * this method will return true if the game is still active
     */
    public boolean gameActive(){
        return  gameOnGoing;
    }

    /**
     * this method will ask player to introduce a row and a column,
     * validate the inputs and call the method makeMove
     */
        public  void askPlayer( char player){
            Scanner input = new Scanner(System.in);
            int row, col;

            do {
                System.out.printf("player %s enter a row and a column(1-3) :", player, ' ');
                row = input.nextInt();
                col = input.nextInt();
            }
            while (notValid(row,col));
            makeMove(player, row-1, col-1);

        }

    /**
     * this method will check to see if someone wins
     */
public  boolean checkForWinner(){
    // check the row
    for (int row = 0; row< gameBoard.length; row++){
        if(gameBoard[row][0] == gameBoard[row][1] && gameBoard [row][1] == gameBoard[row][2]
        && gameBoard [row][0] != ' ') {
            System.out.println("The winner is " + gameBoard[row][0]);
            gameOnGoing = false;
        }
    }
    // check the column
    for (int col = 0; col< gameBoard.length; col++){
        if(gameBoard[0][col] == gameBoard[1][col] && gameBoard [1][col] == gameBoard [2][col]
                && gameBoard [0][col] != ' ')
        {
            System.out.println("The winner is " + gameBoard[0][col]);
            gameOnGoing = false;
        }
    }
    //check the diagonals
    if (gameBoard[0][0] == gameBoard [1][1] && gameBoard[1][1] == gameBoard [2][2] && gameBoard[0][0] != ' ' ) {
        System.out.println("The winner is " + gameBoard[0][0]);
        gameOnGoing = false;
    }
    if (gameBoard[0][2] == gameBoard [1][1] && gameBoard[1][1] == gameBoard [2][0] && gameBoard[2][0] != ' ' ) {
        System.out.println("The winner is " +gameBoard[1][1]);
        gameOnGoing = false;
    }
    return false;
}



    /**
     * this method will validate if the row and columns are between 1-3
     * and if the position is currently empty
     */
    public boolean notValid(int row, int col){
        if (row > 3 || row < 1 || col > 3 || col <1 || !isEmpty(row,col))
            return true;
        else
        return false;

    }
    /**
     * this method will check if a position is empty
     * @return true if the position is empty, false otherwise
     */
        public boolean isEmpty(int row, int col){
            if (gameBoard [row-1][col-1] == ' ')
                return  true;
            else {
                System.out.println(" That spot is taken!!! Pleas try again!");
                return false;
            }

}

    /**
         * this method validates if players move is valid and return true
         * if the move is completed
         */
        public boolean makeMove(char player, int row, int col) {
            if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {

                if (gameBoard[row][col] != ' ')
                    return false;

                else
                gameBoard [row][col] = player;
                return true;
            }
            else
                return false;
        }
}
