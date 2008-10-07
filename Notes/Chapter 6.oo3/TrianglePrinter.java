/* 
 * 
 * Use a nested loop to create the following output
 * 
 * []
 * [] []
 * [] [] []
 * [] [] [] []
 * 
 */

import java.util.Scanner;

public class TrianglePrinter
{
     public static void main (String [] args)
     {
          Scanner in = new Scanner (System.in);
          
          int sideLength = 0;
          
          System.out.println("Please enter a legth for the side of the triangle: ");
          sideLength = in.nextInt ();
          
          //Outer loop controls number of rows for this triangle
          for (int i = 0; i < sideLength; i++)
          {
               for (int j= 0; j <= i; j++)
               {
                    System.out.print("[]");
                    
               }//end inner loop
               System.out.println();
          }//end outer loop
          
        
     }//end main method
}//end class