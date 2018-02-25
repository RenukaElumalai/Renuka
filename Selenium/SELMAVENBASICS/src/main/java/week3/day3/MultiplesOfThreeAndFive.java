package week3.day3;

import java.util.Scanner;

public class MultiplesOfThreeAndFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter tthe number");
		int number=sc.nextInt();
		int Sum=0;
		for(int i=1;i<number;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				Sum=Sum+i;
				System.out.print(i);
				System.out.print(" ");
				
			}
						
		}
		System.out.println();
		System.out.println("The sum of Multiples of 3 and 5 is "+Sum);
	}

}
