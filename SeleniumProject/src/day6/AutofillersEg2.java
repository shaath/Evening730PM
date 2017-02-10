package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutofillersEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("spider");
		Sleeper.sleepTightInSeconds(5);
		
		List<WebElement> auto=driver.findElements(By.xpath(".//*[@id='suggestions']/div"));
		
		System.out.println(auto.size());
		
		for (int i = 0; i < auto.size(); i++)
		{
			String text=auto.get(i).getText();
			System.out.println(auto.get(i).getText());
			if (text.equalsIgnoreCase("spiderman dress"))
			{
				auto.get(i).click();
				break;
			}
		}
	}

}
