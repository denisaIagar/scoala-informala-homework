public class Main {
    public static void main(String[] args) {
    TicTacToeBoardGame myGame = new TicTacToeBoardGame();
   myGame.displayBoard();
    int counter = 1;



    while (myGame.gameActive() && counter < 10){
        if ( counter % 2 == 0)
            myGame.askPlayer('O');
        else
            myGame.askPlayer('X');
        counter++;

        System.out.println("\n");
        myGame.displayBoard();
        myGame.checkForWinner();

        if (counter == 10){
            System.out.println("No one wins!!");
        }
    }
    }

}
