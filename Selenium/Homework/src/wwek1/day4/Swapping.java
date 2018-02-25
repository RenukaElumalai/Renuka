package wwek1.day4;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		int firstNum,secondNum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		firstNum=sc.nextInt();
		System.out.println("Enter the second number");
		secondNum=sc.nextInt();
		//Before Swap
		System.out.println("Before Swap");
		System.out.println();
		System.out.println("The value of first Number is "+firstNum);
		System.out.println("The value of Second Number is "+secondNum);
		System.out.println();
		firstNum=firstNum+secondNum;
		secondNum=firstNum-secondNum;
		firstNum=firstNum-secondNum;
		//After Swaap
		System.out.println("After Swap");
		System.out.println();
		System.out.println("The value of first Number is "+firstNum);
		System.out.println("The value of Second Number is "+secondNum);
								
	}

}
