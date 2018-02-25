package day5.array;

public class Arrayduplicate {

	public static void main(String[] args) {
		int a[]={13,15,67,88,65,13,99,67,65,87,13};
		int length=a.length;
		System.out.println("The length of the array is "+length);
		System.out.print("The Duplicate numbers are:  ");
		for(int i=0;i<length;i++)
		{
		for(int j=i+1;j<length;j++)
			{
			if(a[i]==a[j])
			{
				System.out.print(a[i]+" ");
			}
			}	
		}
		

	}

}
