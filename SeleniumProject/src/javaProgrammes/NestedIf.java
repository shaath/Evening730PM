package javaProgrammes;

public class NestedIf 
{

	public static void main(String[] args) 
	{
		int a=300000;
		int b=40000;
		int c=5000;
		
		if (a > b & a > c) 
		{
			System.out.println("A is Greater");
		}
		else if(b > a & b > c)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}

	}

}
