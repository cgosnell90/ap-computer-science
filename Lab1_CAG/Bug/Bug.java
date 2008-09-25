/*
 * Bug class contains the values associated with the position of a bug on a horizontal line.
 * By: Christopher Gosnell
 * Date: 09/21/08
 */

public class Bug
{
  int position ;
  char moveWay ;
  
  public Bug (int initialPosition)
  {
    position = initialPosition;
    
  }// end method
  
  public void turn(char turnPosition)
  {
    if (turnPosition == 'l')
    {
      moveWay = 'l';
    }
    else if (turnPosition =='r')
    {
      moveWay = 'r';
    }
    else
      System.out.println(" ERROR ENTER IN CORRECT TURN VALUE!!");
  }
  public void move()
  { 
    if (moveWay == 'l')
    {
      position -= 1;
    }
    else if (moveWay == 'r')
    {
      position += 1;
    }
    else
      position += 1;
    
  }// end method
  
  public int getPosition()
  {
    return position;
  }// end method
}

