package programPract;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to verify it is Amstrong or not: ");
		int num = sc.nextInt();
		int oldnum= num;
		
		int prevnum=num;
		int cnt = 0;
		int arm = 0;
		//153 = 1*3+5*3+3*3 = 1+125+27 = 153
		
		while(num>0)
		{
			int d=num%10;//
			num=num/10;
			arm = arm+d*d*d;	
		}
		System.out.println("Number of digits: "+arm);
		
		if(arm==prevnum)
		{
			System.out.println("This is Amstrong");
		}
		else
		{
			System.out.println("This is not Amstrong");
		}
		
	}
	
	

}
