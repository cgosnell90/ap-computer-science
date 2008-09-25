/**
 / This object is used to simulate a bank account's basic functions, deposit, withdraw and 
 / perform interest.
 /By: Christopher Gosnell
 /Date: 9/23/08
 */

public class BankAccount
{
          
	private double balance;
         
      public BankAccount ( double initBalance)
     {
          balance = initBalance;
          
     }
  
  
       public void deposit (double amount)
     { 
          balance += amount;
          
     }
     
     
  
       public void withdraw (double amount)
     { 
          balance -= amount;
          
     }
     
     public void addInterest(double rate)
     {
     	double percent = rate / 100;
     balance += balance + ( balance / percent); 
     }
     
          public double checkBalance ()
     { 
          return balance;
          
     }
}