/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  Player Player1;
  Player Player2;
  Board gameBoard;
  Boolean solved;
  /* your code here - constructor(s) */ 
  //intializes players and board
  public PhraseSolver(String name1, String name2){
    gameBoard = new Board();
    Player1 = new Player(name1);
    Player2 = new Player(name2);
    solved = false;
  }
  /* your code here - accessor(s) */

  
  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}