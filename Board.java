/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class Board
{
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue; 

  /* your code here - constructor(s) */ 
  
//constructor to initalize everything with default values
  public Board(){
    solvedPhrase = ""; //initializes
    phrase = loadPhrase(); 
    setLetterValue();
    System.out.println("Phrase: " + phrase); //temp test code
  }
  /* your code here - accessor(s) */
  /*
   * Precondition:
   * Solvedphrase has been initialized and populated
   * 
   * Sends solved phrase to accesor
   */
  public String getSolvedPhrase(){
    return solvedPhrase; 
  }

  /*
   * Precondition:
   * currentLetterValue has been initialized and populated
   * 
   * Sends solved phrase to accesor
   */
  public int getLetterValue(){
    return currentLetterValue; 
  }

  /*
   * Precondition:
   * currentLetterValue has been initialized
   * 
   * Sends solved phrase to accesor
   */
  public void setLetterValue(int x){
    currentLetterValue = x;
  }

  /*
   * Precondition:
   * SolvedPhrase is intialized populated
   * 
   * Checks if given phrase is correct or not
   */
  public Boolean solvePhrase(String x){
    if(x.equals(solvedPhrase)){
      return true;
    }
    return false;

  }
  
  /* your code here - mutator(s)  */


  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("C:/Users/anika/Desktop/CSA PhraseSolver/phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt" ); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("C:/Users/anika/Desktop/CSA PhraseSolver/phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  
    
    return tempPhrase;
  }  

  public boolean guessLetter(String guess)
  {
    boolean foundLetter = false;
    String newSolvedPhrase = "";
    
    for (int i = 0; i < phrase.length(); i++)
    {
      if (phrase.substring(i, i + 1).equals(guess))
      {
        newSolvedPhrase += guess + " ";
        foundLetter = true;
      }
      else
      {
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    solvedPhrase = newSolvedPhrase;
    return foundLetter;
  } 
} 