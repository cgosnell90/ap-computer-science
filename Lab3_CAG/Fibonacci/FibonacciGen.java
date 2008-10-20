/************************************************************************
  *
  * AP Computer Science
  * Name: Christopher Gosnell
  * Date: 10/8/08
  * Title: FibonacciGen.java
  * Description: Generates a list of Fibonacci numbers. 
  *
  *************************************************************************/

import java.util.Scanner;

public class FibonacciGen
{
      public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
         System.out.println("Enter in the number of Fibonacci numbers you want to calculate: ");
        FibonacciObject name = new FibonacciObject(in.nextInt());
           
       
        while ( name.fibGenRe () > 0)
        {
          System.out.print (name.fibPrint ()+"\n");      
        }
            
      }
}