/**
 * Description: Show how to properly compare two doubles
 * */

public class DoubleCompare
{
     public static void main (String args[])
     {
          double root = Math.sqrt(2);
          doubl result = root * root -2;
          
          if(result == 0)
               System.out.println("sqrt(2) squared minus 2 is 0");
          else
               System.out.println ("sqrt(2) squared minus 2 is not 0" + " but " + result);
     }
}