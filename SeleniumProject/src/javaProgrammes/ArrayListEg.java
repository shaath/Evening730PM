package javaProgrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<>();
		//Writing the data into the array
		
		s.add("Manual");
		s.add("Selenium");
		s.add("UFT");
		s.add("LoadRunner");
		s.add("UFT");
		s.add(5, "CodedUI");
		s.add(3, "QEdge");
		
		//Finding the length of the arraylist
		
		System.out.println(s.size());
		
		//Reading the data from arraylist
		
//		System.out.println(s.get(2));
		
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
			
		}
		
		

	}

}
