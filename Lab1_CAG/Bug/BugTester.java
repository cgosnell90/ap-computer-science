/*
 * 
 * This Programs tests the object Bug.java
 * To turn left enter 'l' to turn parameter or enter 'r' to turn parameter for turning right.
 * By: Christopher Gosenll
 * Date: 09/21/08
 */
public class BugTester
{
  public static void main(String args[])
  {
    Bug frankDaBug = new Bug(10);
    
    frankDaBug.move();// right 1, position 11
    frankDaBug.turn('l');// turn left, position 11
    frankDaBug. move();// left 1, position 10
    frankDaBug. move();// left 1, position 9
    frankDaBug. turn('r');// turn right, position 9
    frankDaBug. move();// right 1,position 10  
    
    System.out.println("The position of your bug is "+ frankDaBug.getPosition()); // prints final position
  
  } 
}// end program
               