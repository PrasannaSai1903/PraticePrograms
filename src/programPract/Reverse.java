package programPract;

import java.util.Scanner;

public class Reverse 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to reverse:   ");
		int num = sc.nextInt();
		int rev = 0;
		
		//85
		while(num>0)
		{
			int d = num%10; //85%10 = 5//8
			rev = rev*10+d; //5 //58
			num = num/10; //85/10 =8
		}
		
		System.out.println("Reverse a number: "+rev);
		sc.close();
	}
}
