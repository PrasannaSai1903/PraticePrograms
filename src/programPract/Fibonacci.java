package programPract;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number we need fibonacci series: ");
		int num = sc.nextInt();
		
		int a = 0;
		int b=1;
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(a+",");
			int c = a+b; //0,1,1
			a=b;//1
			b=c;//1
		}
		sc.close();
	}

}
