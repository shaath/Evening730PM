package javaProgrammes;

public class StaticArrayEg1 {

	public static void main(String[] args) 
	{
		int[] salary={20000,30000,40000,50000,60000,70000};
	
		//Length of the array
		
		System.out.println(salary.length);
		
//		System.out.println(salary[3]);
//		
//		for (int i = 0; i < salary.length; i++) 
//		{
//			System.out.println(salary[i]);
//		}
		
		for (int s : salary) 
		{
			System.out.println(s);
			
			
		}

	}

}
