package week6;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		//int stringLength=s1.length();
		if((s1.length())==5)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
} 
