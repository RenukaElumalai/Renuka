package wwek1.day4;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number,temp,initialNumber;
		double sum=0;
		Scanner x=new Scanner(System.in);
		System.out.println("enter a number");
		number=x.nextInt();
		initialNumber=number;
		while(number>0)
		{
			temp=number%10;
			sum=sum+Math.pow(temp, 3);
			number=number/10;
		}
		if(sum==initialNumber)
		{
		System.out.println("The number is a Armstrong number");
		}
		
		else 
		{
		System.out.println("The number is not a Armstrong number");
		}
	}

}
