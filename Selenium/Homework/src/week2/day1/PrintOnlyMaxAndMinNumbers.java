package week2.day1;

import java.util.Scanner;

class PrintOnlyMaxAndMinNumbers { 
 
  public static void main(String args[]){
	  int n, temp;
	  Scanner s = new Scanner(System.in);
      System.out.print("Enter no. of elements you want in array:");
      n = s.nextInt();
      int a[] = new int[n];
      System.out.println("Enter all the elements:");
      for (int i = 0; i < n; i++) 
      {
          a[i] = s.nextInt();
      }
 
    // Calling getMax() method for getting max value
    int max = getMax(a);
    System.out.println("Maximum Value is: "+max);
 
    // Calling getMin() method for getting min value
    int min = getMin(a);
    System.out.println("Minimum Value is: "+min);
  }
 
  // Method for getting the maximum value
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  // Method for getting the minimum value
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}