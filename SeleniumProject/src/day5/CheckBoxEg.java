package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CheckBoxEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		driver.findElement(By.id("next")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		WebElement check=driver.findElement(By.id("PersistentCookie"));
		
		
		if (check.isSelected())
		{
			check.click();
		}
		else
		{
//			check.click();
			System.out.println("It is already in unchecked position");
		}

	}

}
