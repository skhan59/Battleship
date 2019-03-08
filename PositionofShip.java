import java.util.Random;
/*
 * The positionofShip class describes the exact position of the ship on the board
 */
public class PositionofShip {
/*
* The positionofShip class describes the exact position of the ship on the board
*/
private static BattleshipBoard board;
public PositionofShip(BattleshipBoard b) {
board = b;
}

    //private BattleshipBoard [][] ShipPlacement;//Creating a ship
public static void createShip(int size)
     {
	Random rand = new Random();//Random Generator created for computer to randomly place ship on board
	int HV = rand.nextInt(2);//random intger btwn 0 and 1; 0 means horizontal 1 means vertical
        if(HV == 1) //Vertical
        {
        
           int col = rand.nextInt(5);//Generating a random integer based on column
           int row = rand.nextInt(5);//Generating a random integer based on row
           
           for(int i = 0; i<size; i++)//"S" means ship and it is being placed on the board
           {
          if(col+i < board.getCol())//Checker.//Correction with Ismail
          board.getBoard()[row][col+i] = "S";
          else
          board.getBoard()[row][col-i] = "S";
           }
        } else { // horizontal. Random generator for horizontal
            int col = rand.nextInt(5);
            int row = rand.nextInt(5);
           for(int i = 0; i<size; i++)
           {
           if(row+i < board.getRow())//Correction with Ismail. This means we have a row length that is less than current row length
          board.getBoard()[row+i][col] = "S";
          else
          board.getBoard()[row-i][col] = "S";
           }
        }
    }
}

//If variable ship is within bounds of array statement, then print the shape else give an error message or else break
//Use for-loop to check each ship
//