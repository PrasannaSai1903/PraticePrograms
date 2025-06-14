package programPract;

import java.util.Scanner;

public class PrimeNumber 
{
  public static void main(String args[])
  {
	  //7-> 2,3,4,5,6,7
	  boolean blnVrfyPrime = true;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please Number to check whether it is prime number or not:   ");
	  int num = sc.nextInt();
	  
	  for(int i =2 ;i<num;i++)
	  {
		  if(num%i ==0)
		  {
			blnVrfyPrime = false;
			break;
		  }
	  }
	  
	  if(blnVrfyPrime)
	  {
		  System.out.println("Given Number : "+num+" is prime Number");
	  }
	  else
	  {
		  System.out.println("Given Number : "+num+" is not a prime Number");
	  }
	  sc.close();
	  
  }
}
