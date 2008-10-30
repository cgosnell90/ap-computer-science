/*
 * Author: Christopher Gosnell
 * Created: 10/22/08
 * Description: This program that stores 10 random ints between 1 and 100 into an array.
 * 
 * Assignment: Write a loop that fills an array of ints with 10 random numbers between 1 and 100. 
 *             Call the file RandomInts1.java and write it to contain a main method (not as an object)
 *             Write a for loop that contains 10 DIFFERENT random numbers from 1 to 100. Note that the 
 *             first example can contain duplicates, 
 *             but in this one, you may have to write a second loop to check if the number already exists. 
 *             Call the file RandomInts2.java and write it to contain a main method (not as an object)
 * 
 * 
 */

import java.util.Random;

public class RandomInts2
{
  public static void main(String args[])
  {
    int randCount =0 ;
    boolean randDiff;
    Random gen = new Random ();
    
    int[] dataInts = new int[10];
    
    for (int i = 9; i>=0; i--) // loops ten times 
    {
      
      randDiff = false;
      
      while (!randDiff)
      {
        randDiff = true;
        randCount = gen.nextInt(100) +1;
        
        for (int z = 9; z >=0; z--)// loops ten times checking to see if ints match in array
        {
          if (randCount == dataInts[z])
            randDiff = false;
        }// end inner for loop       
        
      }// end while loop
      dataInts[i] = randCount;
      
    }// end outer for loop
    
    int count = 0;// counts element's positions in array
    for (int i = 9; i>=0; i--)
    {
      System.out.println("\n The random integer entered into element "+ count +" is: ");
      System.out.println("\t[ " + dataInts[count] + " ]");
      count++;
    }// end printing for loop
       
    
  }//end method
}//end