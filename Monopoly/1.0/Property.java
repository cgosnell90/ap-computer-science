/**
 * Author: Christopher Gosnell
 * Created: 10/29/08
 * Description: This class stores all the values associated with a Property
 * such as: name, owner, type, color, cost, rent and space on the board.
 * 
 * @author Christopher Gosnell
 * @version 1.00 
 */

public class Property
{
  private String propertyName;
  private String owner;
  private int type;
  private String color;
  private int cost;
  private int rent;
  private int mortgage;
  private int space;
  
  /**
   * 
   * Initilizes the property object
   * 
   * @param name the name the user enters for the property
   * @param o the owner of the property
   * @param t the type of property
   * @param col the color of the property's space
   * @param cos the cost of the property
   * @param r the cost of rent
   * @param m the mortgage of the property
   * @param s the location of the property on the board
   */
  
  Property(String name, String o, int t, String col, int cos, int r, int m, int s)
  {
    propertyName = name;
    owner = o;
    type = t;
    color = col;
    cost = cos;
    rent = r;
    mortgage = m;
    space = s;
  }// end Property constructor 
  
  /**
   * Changes the name of the property
   * 
   * @param n changes the name of the property
   */ 
  
  public void setName (String n)
  {
    propertyName = n;
  }// end setName method
  
  /**
   * Retrieves the name of the property
   * 
   * @return propertyName property's name
   */ 
  
  public String getName()
  {
    return propertyName;
  }//end getName method
    
  /**
   * Retrieves the name of the Owner
   * 
   * @return owner name of owner
   */
  
  public String getOwner()
  {
    return owner;
  }// end getOwner method
  
  /**
   * Changes the Owner name
   * 
   * @param oName changes the owner's name
   */
  
  public void setOwner(String oName)
  {
    owner = oName;
  }// end setOwner method
  
  /**
   * Retrieves the type of property
   * 
   * @return type the current type of property 
   */
  
  public int getType ()
  {
    return type;
  }// end getType method
  
  /**
   * Retrieves the current property color
   * @return color returns the current property color
   */
  
  public String getColor()
  {
    return color;
  }// end getColor method
  
  /**
   * Changes the color of property
   * 
   * @param newColor changes the current color
   */
  
  public void setColor(String newColor)
  {
    color = newColor;
  }//end setColor method
  
  /**
   * Retreives the current cost of property
   * 
   * @return cost returns current cost of property
   */
  
  public int getCost ()
  {
    return cost;
  }//end getCost method
  
  /**
   * Changes the cost of property
   * @param costChange changes the current cost of peroperty 
   */
  
  public void setCost (int  costChange)
  {
    cost = costChange;
  }// end setCost method
  
  /**
   *Retrieves the current rent of property
   * 
   * @return rent returns the cost of property
   */
  
  public int getRent ()
  {
    return rent;
  }// end getRent method
  
  /**
   * Retrieves the current mortgage of property
   * 
   * @return mortgage returns the current mortgage
   */
  
  public int getMortgage()
  {
    return mortgage;
  }// end getMortgage method
  
  
  /**
   * Retrieves the current space of property
   * 
   * @return space returns the current space of property
   */
  
  public int getSpcae()
  {
    return space;
  }//end getSpace method
  
  /**
   * Changes the information into String 
   * so it can be printed
   * 
   * @return String of all information about property
   */
  
  
  /*
   *  private String propertyName;
  private String owner;
  private int type;
  private String color;
  private int cost;
  private int rent;
  private int mortgage;
  private int space;
  */
  
  public String toString ()
  {
    String stats = (String)"|Property Name: " + propertyName + 
                          "\n|        Owner: " + owner +
                          "\n|        Type: " + type+
                          "\n|        Color: " + color +
                          "\n|        Cost: " + cost +
                          "\n|        Rent: " + rent +
                          "\n|        Mortgage: " + mortgage +
                          "\n|        Space: " + space +
                          "\n+-----------------------------------|";
     
     return stats;
  }
    
  
  
  
  
    
    
  
  
  
  
    
  
    
  
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}