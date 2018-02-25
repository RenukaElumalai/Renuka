package arrayHomework;

import java.util.Scanner;

public class Twodimensionalarrayinmatrix {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner x= new Scanner(System.in);
		System.out.println("enter the number of rows");
		  int  a = x.nextInt();
		  System.out.println("enter the number of columns");
		  int  b = x.nextInt();
		  
		  int [][] array=new int[a][b];
		  for(int i=0;i<a;i++)
		  {
			  for(int j=0;j<b;j++)
			  {
				  
				  System.out.println("enter array["+i+"]"+"["+j+"]:");
				  
				  array[i][j]=x.nextInt();
				  
				  
			  }
			  
		  }
		  
		  System.out.println("In matrix format");
		  for(int i=0;i<a;i++)
		  {
			  for(int j=0;j<b;j++)
			  {
				  
		 
		  System.out.print("\t"+ array[i][j] + " ");
		  

	}
			  
			  System.out.println();

		
}
		  
	}}
