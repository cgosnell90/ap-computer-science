/*
 * This is a class containing the information about a car.
 * By: Christopher Gosnell
 * Date: 9/18/08
 */ 
public class Car
{
     private double gasTank;
     
     public Car ()
     {
          gasTank = 0.0;
     }//end
     
     public Car (double initGas)
        {
          gasTank =  initGas;
        }
      
     public double getGasLeft()
        {
           return gasTank;
         
        }//end
     
     public void addGas (double amount)
         {
           gasTank =  gasTank + amount;
         }//end deposit method
}