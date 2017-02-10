package methods;

public class BasicMethodsEg {

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicMethodsEg b=new BasicMethodsEg();
		b.function3();
		
		boolean flag=b.function4();
		System.out.println(flag);
	}

	//static method without returning anyvalue
	
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	//static method with returning value
	
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	
	//Non static Method without returning any value
	
	public void function3()
	{
		System.out.println("This is function3 code");
		
	}
	//Non static Method with returning value
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
}
