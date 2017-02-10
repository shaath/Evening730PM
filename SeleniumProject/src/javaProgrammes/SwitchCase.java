package javaProgrammes;

public class SwitchCase {

	public static void main(String[] args) 
	{
		String course="CodedUI";
		
		switch (course) 
		{
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "Qtp":
			System.out.println("You are selected Qtp");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "LoadRunner":
			System.out.println("You are selected LoadRunner");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}
		

	}

}
