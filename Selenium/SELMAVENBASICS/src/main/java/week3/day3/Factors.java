package week3.day3;

import java.util.Scanner;

public class Factors {

	static int temp=0;
	public static void main(String[] args) {
		
		Factor();
}


public static void Factor()
{
	Scanner sc=new Scanner(System.in);

System.out.println("Enter the number");
int number=sc.nextInt();

for(int i=1;i<=number;i++)
{
	if((number%i)==0)	
	{
		for(int j=2;j<=i/2;j++)
		{
			temp=i%j;
		if(temp==0)
			
		{
		System.out.println("1");
	}
		else
		{
			System.out.print(i +" ");
			}
		}
		}
	else
	{
		System.out.println("2");
	}
		
}
}
}
