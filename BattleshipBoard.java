import java.util.Scanner;
   public class BattleshipBoard
   {
   
  private static String[][] board; //variables
  private int row;
  private int col;
   
  public BattleshipBoard(int row, int col) {
  this.row = row;
  this.col = col;
  board = new String[row][col];
  createBoard();
  showBoard();
  }
  public int getCol() {
  return col;
  }
   
  public int getRow() {
  return row;
  }
   
  public String[][] getBoard(){
  return board;
  }
     
      public void createBoard() //first function creates the board using two for loops 
      //one for rows one for columns 
      {
         for(int row = 0; row < board.length; row++)
         {
            for(int column = 0; column < board[0].length; column++)
            {
               board[row][column] = "-"; //board is represented by dash marks
            }
         }
      }
      public void showBoard() { //makes board appear on screen



         for(int row = 0; row < board.length; row++) {
         

        	 System.out.print((row+1) + " ");
         for(int column = 0; column < board[0].length; column++) {
        	 
         
         if(board[row][column].equals("S")) { //Ship's are labeled with "S" marks
         
         System.out.print(" " + "-"); //hides the "S'" with dash marks 
         
         } else {
         
         System.out.print(" " + board[row][column]);
         }
         }
         System.out.println("");
         }
     System.out.println("");

      }
     
    
      public static void main(String[] arg) {
     String goAgain;
         Scanner keyboard = new Scanner(System.in);
         String difficulty;
         
         do {
         
         System.out.println("Choose your difficulty! Type 'easy' if you're a wuss, "
         + "'medium' if you're an average joe, or "
         + "'hard' if you just love to torture yourself");
         difficulty = keyboard.next();
         if (difficulty.equalsIgnoreCase("easy") ) { 
         
        
     
    System.out.println("   1 2 3 4 5 6"); 
         BattleshipBoard bshipboard = new BattleshipBoard(6,6);
         PositionofShip p = new PositionofShip(bshipboard) ;
         p.createShip(3);
    

  System.out.println("   1 2 3 4 5 6"); 

         bshipboard.showBoard();
         playerEasy p1 = new playerEasy(bshipboard);
         p1.createPlayer(20,0);
  System.out.println("   1 2 3 4 5 6"); 

         bshipboard.showBoard();//Call showBoard method in the battleship board class

         
        
         
         
         
      }
         if (difficulty.equalsIgnoreCase("medium") ) { 
         
             

         
        	  System.out.println("   1 2 3 4 5 6 7 8"); 
 
             BattleshipBoard bshipboard = new BattleshipBoard(8,8);
             PositionofShip p = new PositionofShip(bshipboard) ;
             p.createShip(3);
             p.createShip(3);

             



             System.out.println("   1 2 3 4 5 6 7 8"); 

             
             bshipboard.showBoard();
             playerMedium p2 =  new playerMedium(bshipboard);
             p2.createPlayer(15,0);
       System.out.println(" 1 2 3 4 5 6 7 8"); 

             bshipboard.showBoard();//Call showBoard method in the battleship board class

             
        
             
             
          }
  if (difficulty.equalsIgnoreCase("hard") ) { 
         
             

         
         
          System.out.println("   1 2 3 4 5 6 7 8 9 10"); 
 
             BattleshipBoard bshipboard = new BattleshipBoard(10,10);
             PositionofShip p = new PositionofShip(bshipboard) ;
             p.createShip(3);
             p.createShip(2);
             p.createShip(4);



             
       System.out.println("   1 2 3 4 5 6 7 8 9 10"); 

             bshipboard.showBoard();
             playerHard p3 = new playerHard(bshipboard);
             p3.createPlayer(11,0);
        System.out.println("    1 2 3 4 5 6 7 8 9 10"); 

             bshipboard.showBoard();//Call showBoard method in the battleship board class

             
            
        
             
             
             
             
          }
  System.out.println("You finished the game! Do you want to play again? "
   + "Enter Y for yes, or N for no.");
   goAgain = keyboard.next();
         }
         while (goAgain.equalsIgnoreCase("Y")); 
      
   }
   }