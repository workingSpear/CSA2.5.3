/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name = ""; 
  private double points;
 
   public String getName()
  {
     return name;
  }
 
   public void setName(String x)
  {
    name = x;
  }
  
  public double getPoints()
  {
    return points;
  }

  public void setPoints(double x){
    points = x;
  }
  /* your code here - constructor(s) */ 
  public Player(){
    points = 0.0;
  }
  public Player(String x){
    name = x;
    System.out.println("Welcome " + name + " have fun playing Phrase Solver!");
    points = 0.0;
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}