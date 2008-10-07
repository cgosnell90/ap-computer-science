/*
 * THis is an important example of Java formatting and how if else statements work.
 */

public class DanglingElseCorrect
{
     public static void main (String args[])
     {
          int a = 2, b = 12;
          
          if (a > 0)
               if(b<10)// b is false so goes to bottom else
                  if(b>5)//THis is not used
                     b= 5;//not used
                  else
                    b= 15;//not used
         
           else b= 25;
           
           System.out.println("b is " +b);
     }
}