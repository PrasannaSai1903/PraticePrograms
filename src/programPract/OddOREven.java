package programPract;

import java.util.Scanner;

public class OddOREven 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:   ");
		int num= sc.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("Given number: "+num+" is prime number");
		}
		else
		{
			System.out.println("Given number: "+num+" is not prime number");
		}
		sc.close();
	}

}
