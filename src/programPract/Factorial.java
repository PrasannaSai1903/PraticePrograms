package programPract;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for which we need to do factorial :   ");
		int num = sc.nextInt();
		long fact = 1;
		
		for(int i = num;i>0;i--)
		{
			fact = fact*i;
		}
		
		System.out.println("Final Factorial Number: "+fact);
		sc.close();
	}
	
}
