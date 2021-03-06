/**
 * Author: Christopher Gosnell 
 * Class: AP Computer Science
   This Object describes the sequence of Fibonacci numbers. 
   Date: 10/8/08
   e.g. 1, 1, 2, 3, 5, 8, 13 ...
   
*/

public class FibonacciObject
{
 private double fold1 =1, fold2 =0;
 private double nfold, repeatF;

 
     public FibonacciObject (double fTime )
 {
      repeatF= fTime;
     
 }
 
 
   public double fibPrint ()
     {
       
     nfold = fold1 + fold2;
     
      
        fold1 = fold2;
        fold2 = nfold;
        return nfold; 
   }
    public double fibGenRe ()
  {  
      repeatF--;
     return repeatF;
    
    }
}