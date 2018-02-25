package arrayHomework;

import java.util.Scanner;

public class Palindrome {

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
	     if(temp==sum)
	    	
	 	    System.out.println("The number is Palindrome");
	     else
	    	System.out.println("The number is not Palindrome");
	  

	}

}

	