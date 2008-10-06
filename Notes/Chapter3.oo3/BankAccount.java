/* 
 The layout for writing an bject 
 
 */
 public class BankAccount
 {
	// Part 1
 	//Intrance fields (values) and Public Stratic Variables (constants)
        private double balance; // no specific value assigned yet
        
        //Part 2
        // Constructor(s) one or more or none
       //default constructor
        public BankAccount ()
        {
        		balance = 0.0;
        }
           
	// this constructor sets an initial amount for balance
        public BankAccount (double initBalance)
        {
        		balance =  initBalance;
        }
        
        //Part 3
        // Methods (actions) that this object can perform
        public double getBalance()
        {
         		return balance;
         
	}//end getBalance method
         
         public void deposit (double amount)
         {
         		balance =  balance + amount;
         }//end deposit method
         
  }// end BankAccount class
        
        
        