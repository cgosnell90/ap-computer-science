/* 
 * By: Christopher Gosnell
 * Description: This object is used to calculate prime numbers.
 * Date: 10/8/08
 */

public class PrimNumObject
{
  int valP; 
  int numOfPrime;
  
  public PrimNumObject (int aMax)
  {
    numOfPrime = aMax;
  }
  
  public int nextPrime()
  {
    
     int num1,num2;
        int primeCheck=0; //Checks to see if the numbers are prime or not
        
        for( num1=1;num1<= numOfPrime ;num1++)
            {
                primeCheck=0;
                for( num2=1;num2<num1;num2++) 
                    {
                        if(((num1%num2)==0) & num2!=1)
                        {
                            primeCheck=1; //primeCheck helps to see if number is prime
                        }
                    }
                   if(primeCheck==0)
                    {
                      System.out.println(num1+"\n");//prints prime numbers
                    }
            }
        return num1 -1;// returns the original number 
  }
  
  
  
  
}//end