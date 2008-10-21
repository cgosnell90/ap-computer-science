/*
 * Author: Chris Gosnell
 * Date: 10/19/08
 * Description: Guess the random number!!
 */

import java.util.Random;
import java.util.Scanner;

public class GuessNumbers
     
{     public static void main (String args[])
     {
     int num1;
     Random gen = new Random ();
     Scanner in = new Scanner(System.in);
     System.out.println("Please enter a guess for matching random  number between 1 and 10: ");
     in.nextInt();
     if (in.nextInt() >10 || in.nextInt() <1)
     {
          System.out.println("REDO ENTER IN CORRECT TYPE!!");
          System.exit(0);
     }
       num1 = gen.nextInt (10) + 1;
     
     if (in.nextInt() == num1)
     {
          System.out.println("YOU WINNN!!");
     }
     else
          System.out.println("YOU FAIL TRY AGAIN LOSER!!");
     
                                  
     
     
     
     
     
   
     
     
     
     
}
}