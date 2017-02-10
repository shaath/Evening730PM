package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MouseHoverOps {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(cat).build().perform();
		Sleeper.sleepTightInSeconds(5);
		WebElement mobile=driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span[1]"));
		Sleeper.sleepTightInSeconds(5);
		act.moveToElement(mobile).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[6]/div[1]/div/a[9]/span")).click();
	}

}
