package biggestNumberContains;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		int number;
		int digit;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		System.out.println("enter the didgit");
		digit=sc.nextInt();
		for(i=1;i<number;i++);
		{
			if(String.valueOf(i).contains(String.valueOf(digit)))
			{
				System.out.println(i);
			}
		}
		

	}

}
