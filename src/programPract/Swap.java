package programPract;

import java.util.Scanner;

public class Swap 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number:   ");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter second number:   ");
		int secondNumber = sc.nextInt();
		
		int temp=0;
		
		System.out.println("Before Swapping of First and second Number: "+firstNumber+" and "+secondNumber);
		
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After Swapping of First and Second Number: "+firstNumber+" and "+secondNumber);
	}
}
