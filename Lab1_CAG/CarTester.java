/*
 * This is a Tester for the car class.
 * By: Christopher Gosnell
 * Date: 9/18/08
 */ 

public class CarTester
{
     public static void main (String args[])
     {
          Car myHybrid = new Car(50); // 50 miles per gallon
          mHybrid.addGas(20); //  Tank 20 gallons
          mHybrid.drive(100);// Drive 100 miles
          double gasLeft = myHybrid.getGasLeft(); // Get gas remaining 
     }
}