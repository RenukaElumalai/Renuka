package week5;

public class StaticLearning {
	public static String S1="Hello";
	public String S2="World";

	public static void main(String[] args) {
		
		staticMethod();
		StaticLearning sc=new StaticLearning();
		sc.nonStaticMethod();
	}
	
public static  void staticMethod()
{
	System.out.print(S1+" ");
	StaticLearning sc1=new StaticLearning();
	System.out.println(sc1.S2);
}

public   void nonStaticMethod()
{
	System.out.print(S1+" ");
	StaticLearning sc2=new StaticLearning();
	System.out.println(sc2.S2);
}

}
