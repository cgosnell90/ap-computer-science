/**
 * Author: Christopher Gosnell
 * Created: 10/28/08
 * Description: This class stores all the values associated with a player 
 * such as: name, space on the board, money and the piece he/she uses
 * 
 * @author Christopher Gosnell
 * @version 1.00 
 */

public class Player
{
  private String playerName;
  private String whichPiece;
  private int money;
  private int space;
  private int doubles;
  private boolean inJail;
  private final int PASSGO = 200;
  
  
  /**
   * 
   * Initilized the player object
   * 
   * @param name is the name the user enters
   */
  
  Player(String name)
  {
    playerName = name;
    whichPiece = "Dog";
    money = 1500;
    space = 0;
    doubles = 0;
    inJail = false;
    
    
  }// end default constructor
  
  /**
   * Changes the player's name
   * 
   * @param n is the new name for the player
   * @return name entered
   */ 
  
  public void setName (String n)
  {
    if (n.equals (""))
      playerName = "Player: name not set";
    else 
      playerName = n;
    
    return;// returns players name after change   
  }// end setname metod
  
  
  /**
   * Returns the player's current name
   * 
   * @return player's name
   */
  
  public String getName ()
  {
    return playerName;
  }// end getName method
  
  
  /**
   * Sets the player's space
   * 
   * @param s changes the player's space on the board
   * 
   */ 
  
  public void setSpace (int s)
  {
    space = s;
  }
  
  /**
   * Retrieves the player's position on the board
   * 
   * @return space return's the player's current position
   */
  
  public int getSpace ()
  {
    if (space > 40)
    {
      space -= 40;
      money += PASSGO;// passed go get 200$
    }
    return space;// returns current space
    
  }// end getSpcae method
      
  /**
   * Adds to the player's current position based on
   * number gained through rolling the die
   * 
   * @param dieMove the spaces moved moved by rolling the die 
   */ 
  
  
  public void moveSpace(int dieMove)
  {
    space += dieMove;
     
  }// end moveSpace method
  
  /**
   * Add one to the number of total doubles
   * 
   */
  
  public void addDoubles ()
  {
    doubles ++;
  }// end addDoubles method
  
  /**
   * Retrieves the current number of doubles 
   * achieved
   * 
   * @return doubles returns the number of doubles
   */
  
  public int getDoubles()
  {
    return doubles;
  }// end getDoubles method
  
  /**
   * Resets the current number of doubles to zero
   * 
   */
  
  public void resetDoubles()
  {
    doubles = 0;
  }// end resetDouble method
  
  /**
   * Checks if a player is in jail or not
   * 
   * @return inJail returns telling if player is in jail or not
   */
  
  public boolean isInJail ()
  {
    return inJail;
  }// end isInJail method
  
  /**
   * Changes the true/false value to the
   * opposite of the current one
   * 
   */
  
  public void setInJail()
  {
    inJail = !inJail;
  }// end setInJail method
  
  /**
   * Returns the player's current piece type
   * 
   * @return whichPiece returns a player's board piece type
   */
  
  public String getPiece ()
  {
    return whichPiece;
  }// end whichPiece method
  
  /**
   * Finds the amount of money a player currently has
   * 
   * @return money returns a players total amount of money
   */
  
  public int getMoney()
  {
    return money;
  }// end getMoney method
  
  /**
   * Adds or subtracts money from a Player's current amount
   * 
   * @param addSubMoney add or subtracts money from the player's current amount
   */
  
  public void setMoney (int addSubMoney)
  {
    money += addSubMoney;
  }// end setMoney method
  
  

  
  /**
   * Player's current overall status
   * 
   * @return playerName returns player's name
   * @return whichPiece returns player's piece
   * @return money returns player's current money sum
   * @return space returns player's current space on board
   * @return doubles returns player's number of doubles
   */
  
   public String getStats()
   {
     String stats = (String)"|Player Name: " + playerName + 
                          "\n|       Piece: " + whichPiece +
                          "\n|       Money: " + money +
                          "\n|       Space: " + space +
                          "\n|       Doubles: " + doubles +
                          "\n+---------------------------|";
     
     return stats;
   }// end playerStatus method
       
   
  
}// end Player class