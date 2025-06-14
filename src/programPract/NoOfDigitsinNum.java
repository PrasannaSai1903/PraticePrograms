package programPract;

import java.util.Scanner;

public class NoOfDigitsinNum 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of digits in a num: ");
		int num = sc.nextInt();
		
		int cnt = 0;
		while(num>0)
		{
			num=num/10;
			cnt=cnt+1;
		}
		System.out.println("Number of digits: "+cnt);
	}
}
