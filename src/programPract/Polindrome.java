package programPract;

import java.util.Scanner;

public class Polindrome 
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Number to verify it is Polindrome or not: ");
	  int num = sc.nextInt();
	  int oldnum = num;
	  int rev =0;
	  while(num>0)
	  {
		  int d = num%10;
		  rev = rev*10+d;
		  num=num/10;
	  }
	  
	  if(oldnum==rev)
	  {
		  System.out.println("It is Polindrome Number");
	  }
	  else
	  {
		  System.out.println("It is not Polindrom Number");
	  }
	  sc.close();
  }
}
