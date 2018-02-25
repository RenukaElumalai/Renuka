package exercise;

import java.util.Scanner;

public class NumberandDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int Number = sc.nextInt();
		System.out.println("Enter the Digit:");
		int Digit = sc.nextInt();
		int i =Number;
		boolean flg =true;
		while(Number>=i && flg)
		{
			
			i = i-1;
			if(String.valueOf(i).contains(String.valueOf(Digit)))
			{
				flg =true;
			}
			else
			{
				flg=false;
			}
		}
		System.out.println("Result---->"+i);
		
		

	}

}
