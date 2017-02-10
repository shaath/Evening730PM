package javaProgrammes;

public class DynamicArray {

	public static void main(String[] args)
	{
		int[] x=new int[10];

		//length of the array
		System.out.println(x.length);
		
		//Write the data into the array
		
		x[4]=40000;
		x[8]=60000;
		x[8]=40000;
		System.out.println(x[4]);
		for (int data : x)
		{
			System.out.println(data);
		}
		
		
	}

}
