package week1.day2.Operations;

import java.util.Scanner;

public class Operations {

	
	public static void main(String[] args) {
	
		Double input1,input2,Output;
		String input3;
		@SuppressWarnings("resource")
		Scanner object =new Scanner(System.in);
	 System.out.println("Enter the first input");
	 input1 =object.nextDouble();
     System.out.println("Enter the second input");
		input2 =object.nextDouble();
	 System.out.println("Enter the third input");
		input3 =object.next(); 
		 switch (input3) {
         case "Add":  Output=input1+input2;
         System.out.println("The addition of "+input1+" and "+input2+ " is "+Output);
         break;
         case "Sub":   Output=input1-input2;
         System.out.println("The subraction of "+input1+" and "+input2+ " is "+Output);
    	 break;
         case "Mul":  Output=input1*input2;
         System.out.println("The Multiplication of "+input1+" and "+input2+ " is "+Output);
    	 break;
         case "Div": Output=input1/input2;
         System.out.println("The Division of "+input1+" and "+input2+ " is 1"+Output);
         break;
	
         
		 }
	}
	}

         
         
         
         
         
         
         
         
         
         
	/*if (input3=="Add")
	{
		Output=input1+input2;
		
		System.out.println(Output);
	}
	else if(input3=="Sub")
	{
		
		Output=input1-input2;
		System.out.println(Output);
	}
	else if(input3=="Mul")
	{
		
		Output=input1*input2;
		System.out.println(Output);
		
		
	}
	else if (input3=="Div")
	{
		
		Output=input1/input2;
		System.out.println(Output);
		
		
	}*/
	
