package week6;

public class ConsecutiveNumbers 
{
	public static void main(String[] args)  
	{

		int i;
		int Sum=0;

		for(i=1;i<=9;i++)
		{
			Sum=Sum+((i*100)+(i*10)+i);
			System.out.print(Sum+",");
			Sum=0;
		}
	} 
}
