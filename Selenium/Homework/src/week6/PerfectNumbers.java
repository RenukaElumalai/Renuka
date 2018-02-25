package week6;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number-1;i++)
		{
			if((number%i)==0)
			{
				sum=sum+i;
			}

		}
		if(sum==number)
		{
			System.out.println("The Number is a perfect number");

		}
		else
		{
			System.out.println("The Number is not a perfect number");
		}

	}

}
