package arrayHomework;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,n;
		int sum=0;
		@SuppressWarnings("resource")
		Scanner x= new Scanner(System.in);
		System.out.println("enter the number");
		  a = x.nextInt();
		  
		  while(a > 0)
	        {
	            n = a % 10;
	            sum = sum + n;
	            a = a / 10;
	        }
	        System.out.println("Sum of Digits:"+sum);

	}

}
