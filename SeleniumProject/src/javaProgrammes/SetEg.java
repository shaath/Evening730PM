package javaProgrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEg {

	public static void main(String[] args)
	{
		Set<String> x=new HashSet<>();
		
		//Writing the data into set
		
		x.add("Selenium");
		x.add("UFT");
		x.add("LoadRunner");
		x.add("QEdge");
		x.add("apple");
		x.add("QEdge");
				
		
		//Reading the data from set
		
		Iterator<String> it=x.iterator();
		
		while (it.hasNext()) 
		{
			String data=it.next();
			System.out.println(data);
		}
		
		

	}

}
