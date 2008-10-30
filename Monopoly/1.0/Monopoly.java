/**
 * Author: Christopher Gosnell
 * Created: 10/29/08
 * Description: This class declares a player and die object and 
 * has a welcom screen and main menu for Monopoly
 * 
 * @author Christopher Gosnell
 * @version 1.00 
 */

import java.util.*;

public class Monopoly
{
  public static void main (String args[])
  {
    Scanner in = new Scanner (System.in);
    
    final int SIDES_DIE = 6;
    
    Die dice = new Die (SIDES_DIE);
    Player player1;
    
    System.out.println("         WECOME TO ......");
    System.out.println("MM    MM                                      lll         ");
    System.out.println("MMM  MMM  oooo  nn nnn   oooo  pp pp    oooo  lll yy   yy ");
    System.out.println("MM MM MM oo  oo nnn  nn oo  oo ppp  pp oo  oo lll yy   yy");
    System.out.println("MM    MM oo  oo nn   nn oo  oo pppppp  oo  oo lll  yyyyyy"); 
    System.out.println("MM    MM  oooo  nn   nn  oooo  pp       oooo  lll      yy");  
    System.out.println("                               pp                  yyyyy  "); 
    System.out.println("-----------------------------------------------------------");
    
    
    /*
     * User enters in their name and initilizes a
     * new player object
     */
    
    do
    {
      System.out.println("Player 1 enter youre name at this time! ");
      String playerName = in.nextLine();
      player1 = new Player (playerName);
      
    }while (false);
    // end of do while loop 
    
    boolean playGame = true;
    
    while (playGame)
    {
      System.out.print(player1.getStats());
      if (!player1.isInJail())
      {
        System.out.println("\nPlease enter (roll) to roll or (exit) to exit");
        String inVal = in.nextLine();
        
        String roll = "roll";
        String exit = "exit";
        if( inVal.equals(roll))
        {
          player1.moveSpace(dice.nextRoll());
        }
        else if (inVal.equals(exit))
        {
          System.out.println("\n+*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*_+");                                 
          System.out.println("|   Thanks for playing Monopoly come back again!!     !|");
          System.out.println("|                                                      |");
          System.out.println("|            BE A MAN!! ~St.Fabry                      |");
          System.out.println("|                                                      |");
          System.out.println("+*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*_+");
                                  
          player1.getStats();
          playGame = false;
        }// end inner if else
        else
        {
             System.out.println("+**********************************************+");
             System.out.println("|!!!Enter in either roll or exit!! YOU IDIOT!!!|");
             System.out.println("+**********************************************+");
        }
      
      
      }
      else
      {
        player1.isInJail();
      }// end outer if else

    }// end while loop
    
   
      
   
      
      
      
      
      
      
      
    }// end 
  }// end class