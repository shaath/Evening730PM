package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//getTitle()
//		System.out.println(driver.getTitle());
		//getCurrentUrl()
//		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()
		System.out.println(driver.getPageSource());
		
		
	}

}
