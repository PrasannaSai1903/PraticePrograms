package programPract;

import java.util.Scanner;

public class SwapWOTemp 
{
 public static void main(String args[])
 {
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number:   ");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter second number:   ");
		int secondNumber = sc.nextInt();
		
		System.out.println("Before Swapping of First and second Number: "+firstNumber+" and "+secondNumber);
		
		firstNumber = firstNumber + secondNumber; //5+10 -> 15
		secondNumber = firstNumber - secondNumber; // 15-10 -> 5
		firstNumber = firstNumber - secondNumber; // 15 - 5 -> 10
		
		System.out.println("After Swapping of First and Second Number: "+firstNumber+" and "+secondNumber);
		
 }
}
