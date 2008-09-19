/* 
/ This is a Car object which stores the mpg, distance, and gas amounts for a car and calculates 
/ how much gas remains.
/ By: Christopher Gosnell
/ Date: 9/18/08
*/

public class Car
{
   double mpg;
   double gasTank;
  public Car()
  {
    double mpg = 0;
  }// end
  
  public Car (double milesPer)
  {
    mpg = milesPer;
  }// end
  
  public void addGas (double initGas)
  {
    gasTank = gasTank + initGas;
  }// end
  
 
  
  public void drive (double distance)
  {
    double distanceDriven = distance;
    gasTank = gasTank - (distanceDriven/ mpg);
  }// end
  

  public double getGasInTank()
  {
    return gasTank;
  }
  
}//end class 

