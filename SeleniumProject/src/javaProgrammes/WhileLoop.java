package javaProgrammes;

public class WhileLoop {

	public static void main(String[] args) 
	{
		int i=1;
		while(i <= 100)
		{
			System.out.println(i);
			if (i==50)
			{
				break;
			}
			i=i+1;
		}

	}

}
