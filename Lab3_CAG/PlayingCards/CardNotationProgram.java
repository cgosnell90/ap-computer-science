/*
 * Author: Christopher Gosnell
 * Description: User enters in playing card notation and is returned full card name
 * Date: 10/18/08
 */


import java.util.Scanner;

public class CardNotationProgram
{
  public static void main (String args[])
  {
    String cardVal;
    
     Scanner in = new Scanner (System.in);
     System.out.println("Enter value first: ");
      cardVal = in.next();
      
      
      CardDeck card = new CardDeck( cardVal);
      System.out.print(card.getDescription());
      System.out.println("\n+-------------------------------------+");
      System.out.println("|Hit up to enter another notation!!   |");
      System.out.println("|--(Only if you are using Terminal)---|");
      System.out.println("+-------------------------------------+");
     
      
   
  }
}
                 