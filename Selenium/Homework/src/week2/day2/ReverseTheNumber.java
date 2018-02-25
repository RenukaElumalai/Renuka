package week2.day2;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,r;
		
		int temp;
		int sum=0;
		@SuppressWarnings("resource")
		Scanner x= new Scanner(System.in);
		System.out.println("enter the number");
		  a = x.nextInt();
		  temp=a;
		  
		  while(a > 0)
	        {
			  r=a%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   a=a/10;    
	        }
		  System.out.println("Reverse number is " +sum);
	     }

}
