package javaProgrammes;

public class StaticArrayEg2 {

	public static void main(String[] args) 
	{
		Object[] s={20000,"Selenium",'M',333.333,true};
		
		System.out.println(s.length);
		
		for (Object data : s) 
		{
			System.out.println(data);
		}

	}

}
