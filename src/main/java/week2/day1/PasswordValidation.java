package week2.day1;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password:");
		String pwd=sc.next();
		if (pwd.length()<=10) 
{
	System.out.println("Pwd contains ten characers in length");
}
else
{
	System.out.println("P");
}
			
		
		

	}

}
