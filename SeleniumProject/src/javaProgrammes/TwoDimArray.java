package javaProgrammes;

public class TwoDimArray {

	public static void main(String[] args)
	{
		Object[][] s=new Object[2][3];

		//Finding the length of the arrays
		
		System.out.println("The number of Rows "+s.length);
		
		//Finding the number of columns
		
		System.out.println("The number of columns "+s[1].length);
		
		//Writing the data into the array
		
		s[0][2]="Selenium";
		s[1][1]="UFT";
		
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
				
			}
		}
	}

}
