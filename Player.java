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

  /*
   * Precondition:
   * name has been initalized and populated
   * 
   * Sends name to accesor
   */
  public String getName()
  {
     return name;
  }
 /*
   * Precondition:
   * name has been initialized
   * 
   * Sets name to x
   */
   public void setName(String x)
  {
    name = x;
  }
  /*
   * Precondition:
   * Points has been initialized and populated
   * 
   * Sends points to accesor
   */
  public double getPoints()
  {
    return points;
  }

  /*
   * Precondition:
   * points has been initialized
   * 
   * Sets points to x
   */
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