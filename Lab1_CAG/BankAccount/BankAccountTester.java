/**
 / This program is used to simulate a bank account's basic functions, deposit, withdraw and 
 / perform interest... testing the BankAccount object
 /By: Christopher Gosnell
 /Date: 9/23/08
 */
public class BankAccountTester
{
          
     public static void main (String args [])
     {
      
          BankAccount myAccount = new BankAccount (1000);
         
           myAccount.addInterest(10);
          
                   
          System.out.println("My Account has $" + 
                             myAccount.checkBalance ());
               }
}
          
      
 
