import java.util.Scanner;

public class playerHard {
private static BattleshipBoard board;

public playerHard(BattleshipBoard b){
board = b;
}
public int createPlayer(int missles, int hits) {
while (missles > 0 && hits <9) {
System.out.println("Careful Captain, you only have "+missles+" missiles left!"); //counts how many missiles you have left
Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a valid row in which you would like to fire upon.");
    int row = keyboard.nextInt();
    while(row > 10 || row < 1){
    System.out.println("You dingus! That's outta bounds!"); //error checking for rows
    row = keyboard.nextInt();
    }
    System.out.println("Please enter a column in which you would like to fire upon.");
    int col = keyboard.nextInt();
    while(col > 10 || col < 1 ) {
    System.out.println("You jamoke! That's outta bounds! Try again, I insist."); //error checking for columns
    col = keyboard.nextInt();
    }
    if(board.getBoard()[row-1][col-1].equals("S")) //checks if coordinated you guessed are equal to the location of the ship
        {
           
            System.out.println("HIT");
            board.getBoard()[row-1][col-1] = "X"; //ideally, for every hit, the hit would be labeled on the board with an "!", and updated for every turn
          hits++;
        }
   
        else
        {
            System.out.println("MISS");
            board.getBoard()[row-1][col-1] = "O";
        }
    missles--;
    System.out.println("   1 2 3 4 5 6 7 8 9 10"); 
    board.showBoard();
}
 
        if(hits < 9)
            System.out.println("Sorry, but you lost because you didn't sink the ship,");
        if(missles < 1)
            System.out.println("and you have lost all your missiles");
        if(hits > 9)
            {
              System.out.println("You have beaten the game battleship, Thanks for playing!");
            }
         
return hits;

      }
      
     }