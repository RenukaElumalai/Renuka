package week1.day3.fizzbuzz;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		int input1,input2;
		@SuppressWarnings("resource")
		Scanner object =new Scanner(System.in);
		 System.out.println("Enter the first input");
		 input1 =object.nextInt();
	     System.out.println("Enter the second input");
			input2 =object.nextInt();
			
			for(int i=input1;i<=input2;i++)
			{
				if(((i%3)==0) && ((i%5)==0))
				{
					
				    			System.out.print("FIZZBUZZ");
			}
	else if ((i%3)==0)
		
	{
		System.out.print("FIZZ");
		
	}
else if ((i%5)==0)
		
	{
		System.out.print("BUZZ");
		
	}
				
else
	
{
	System.out.print(i);
	
}

				System.out.print(" ");
}
			}

	}

