package javaProgrammes;

public class NestedIfEg2 {

	public static void main(String[] args)
	{
		String course="manual";
		if (course.equals("Selenium")) 
		{
			System.out.println("You are selected selenium");
		}
		else if (course.equals("Manual"))
		{
			System.out.println("You are selected Manual");
		}
		else if (course.equals("Qtp")) 
		{
			System.out.println("You are selected Qtp");
		}
		else if (course.equals("LoadRunner")) 
		{
			System.out.println("You are selected loadrunner");
		}
		else
		{
			System.out.println("Select a proper course");
		}

	}

}
