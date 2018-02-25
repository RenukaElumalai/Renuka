package week4.NeedToLearn;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		/* Write a simple Java program to print all factors of number 
		 * using non-static method and print all prime factors of number using static method. */
		System.out.println("Enter the number to find prime factors and factors");
		Scanner scan = new Scanner(System.in);
		int numb = scan.nextInt();
		scan.close();
        primeFactors(numb);
        System.out.println();
        new PrimeFactors().factors(numb);
	}
	
	public static void primeFactors(int num) {
		System.out.print("Prime factors of number " + num +" are ");
		for (int i = 2; i <= num; i++) {
			boolean flag = false;
			while (num % i == 0) {
				num=num/i;
				//num /= i;
				flag = true;
			}
			if (flag)
				System.out.print(i +", ");
		}
    }
	
	public void factors(int num) {
		System.out.print("Factors of number " + num +" are ");
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				System.out.format("%d, ", i);
			}
		}
    }

}
