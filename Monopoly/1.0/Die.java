/*
 * Author: Christopher Gosnell
 * Created: 10/28/08
 * Description: This class takes in a desired number of sides on a die and generates 
 * a random number rolled.
 * 
 * 
 */
import java.util.Random;

public class Die
{
  private Random generator;
  private int numSides;
  
  // Initilizes the die class recieving an int 
  public Die (int sides)
  {    
    numSides = sides; 
  }
  
  
  
  public int getNumSides ()
  {
    return numSides;// returns the number of sides of the die
    
  }// end getNumSides method
  
  
  public void setNumSides (int newSides)
  {
    
    numSides = newSides;// changes the number of sides
    
  }// end setNumSides method
  
  
  public int nextRoll ()
  {
    
    Random generator = new Random ();// initilizes the random object 
    
    int numRoll = generator.nextInt (numSides) +1;
    return (numRoll);// generates and returns the random number 
    
  }// end nextRoll method
  
  
}// end Die Class

