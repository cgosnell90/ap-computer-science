/* 
 * By: Christopher Gosnell
 * Description: This Program uses the PrimeNumber object to calculate a user's desired amount of prime numbers
 * Date: 10/8/08
 */

import java.util.Scanner;

public class PrimeNumberCalculator
{
  public static void main (String args[])
  { int maxVal;
    System.out.println ("Enter in the max number to check for primes: ");
    
    Scanner in = new Scanner (System.in);
    maxVal = in.nextInt();
    System.out.println("----------------------------------------------");
    PrimNumObject prime_Val = new PrimNumObject(maxVal);
       
        System.out.println ("This was the number you wanted primes to: \n" + prime_Val.nextPrime());
         System.out.println();
        
  }//end main method
  
}// end class