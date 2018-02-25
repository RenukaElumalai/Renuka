package week1.day1.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int i,Factorial;
		Factorial=1;
		
		@SuppressWarnings("resource")
		Scanner object = new Scanner(System.in);
		System.out.println("Enter the number");
		int Number = object.nextInt();
		
		for(i=0;i<=Number;i++)
		{
			Factorial=Factorial*Number;
			Number=(Number-1);
				
		}
System.out.println("The factorial of the number is" + " "+Factorial);
	}

}
