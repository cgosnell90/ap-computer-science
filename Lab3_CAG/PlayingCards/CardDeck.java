/********************************************************************************
 *
 *    Name: Christopher Gosnell
 *    Date: 5/25/08
 *    Filename: Card.java
 *    Description: This object contains all the necessary variables and
 *                   methods to be used in card notation
 *********************************************************************************/

public class CardDeck 
{
  /*
   * Adapted from moodle solutions
   */
  public CardDeck( String notation)
  {
     
 
    int n= notation .length();
    if (n < 2)
    {
      type = "WRONG!!";
      suit = "WRONG!!";
    }
    else
    {
      suit = notation.substring( n - 1, n);
      type = notation.substring(0, n-1);
    }
  }//end
  
  public String getDescription()
  {
    String outputMeaning = "";
    
    //Values first A- K and 2- 10
    if (type.equalsIgnoreCase("A"))
      outputMeaning ="Ace";
    else if (type.equalsIgnoreCase("K"))
      outputMeaning ="king";
    else if (type.equalsIgnoreCase("Q"))
      outputMeaning ="Queen";
    else if (type.equalsIgnoreCase("J"))
      outputMeaning ="Jack";
    else if (type.equalsIgnoreCase("2"))
      outputMeaning ="Two";
    else if (type.equalsIgnoreCase("3"))
      outputMeaning ="Three";
    else if (type.equalsIgnoreCase("4"))
      outputMeaning ="Four";
    else if (type.equalsIgnoreCase("5"))
      outputMeaning ="Five";
    else if (type.equalsIgnoreCase("6"))
      outputMeaning ="Six";
    else if (type.equalsIgnoreCase("7"))
      outputMeaning ="Seven";
    else if (type.equalsIgnoreCase("8"))
      outputMeaning ="Eight";
    else if (type.equalsIgnoreCase("9"))
      outputMeaning ="Nine";
    else if (type.equalsIgnoreCase("10"))
      outputMeaning ="Ten";
    else
      return "Check Value";
    
    outputMeaning = outputMeaning + " of ";
    
    //getting suit entered by user
    
    if (suit.equalsIgnoreCase("S"))
      outputMeaning = outputMeaning + "Spades";
    else if (suit.equalsIgnoreCase("H"))
      outputMeaning = outputMeaning + "Hearts";
    else if (suit.equalsIgnoreCase("D"))
      outputMeaning = outputMeaning + "Diamonds";
    else if (suit.equalsIgnoreCase("C"))
      outputMeaning = outputMeaning + "Clubs";
    else 
      return "No Clue Dude  Redo";
    
    return outputMeaning;
  }
   private String type;
  private String suit;
}
    
    
    
    
    
    

     
        
  
  