/*
 * Author: Christopher Gosnell
 * Created: 10/22/08
 * Description: This program reads 10 Strings and stores them into an arrayList and then prints
 * out the Strings in reverse order of what they were entered.
 * 
 * Assignment: Write a loop that reads 10 strings and inserts them into an array list. 
 *             Write a second loop that prints out the string in the opposite order from which they were entered. 
 *             Call the file StringList.java and write it to contain a main method (not as an object). 
 *             Also, use a generic ArrayList declared like the following:
 *             ArrayList<String> words = new ArrayList<String> ();
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class StringList
{
     public static void main (String args[])
     {
          int count = 1;
          int arrayNum = 9;
          Scanner in = new Scanner(System.in);
          
          ArrayList<String> words =  new ArrayList<String>();
          System.out.println("Enter in ten names");
          
          for (int i = 9; i>=0; i--)// User enters in ten names
          {    
               System.out.println("/n Enter in name "+ count);
               words.add(in.nextLine());
               count ++ ;// tells user what number name they are at
               
          }
          
          System.out.println();
          System.out.println("These are the names you entered displayed in reverse:");
          System.out.println();
          
          for (int i= 9; i>=0; i--)// for loop prints out name in reverse
          {
               System.out.println(words.get(arrayNum));
               arrayNum --;// keeps track of what value in the array to print
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
     }//end method
}//end 
