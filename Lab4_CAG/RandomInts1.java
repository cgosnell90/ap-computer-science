/*
 * Author: Christopher Gosnell
 * Created: 10/22/08
 * Description: This program that stores 10 random ints between 1 and 100 into an array.
 * 
 * Assignment: Write a loop that fills an array of ints with 10 random numbers between 1 and 100. 
 *             Call the file RandomInts1.java and write it to contain a main method (not as an object)
 */

import java.util.Random;


public class RandomInts1
{
     public static void main(String args[])
     {
       int count= 0;
       Random gen = new Random ();
       
       int[] dataInts = new int[10];
      
       for (int i = 9; i>=0; i--)
       {
       System.out.println("\n The random integer entered into element "+ count +" is: ");
       System.out.println();
       dataInts  [i] = gen.nextInt (100) + 1;
       System.out.println(dataInts[i]);
       
       count++;
       }
          
          
          
          
          
          
          
          
     }//end method
}//end