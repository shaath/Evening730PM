package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class OrangehrmLogin 
{
	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.partialLinkText("Welcome")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.linkText("Logout")).click();
		
		//Close()
		
		driver.close();

		//Close the eclipse
		WindowsUtils.killByName("eclipse.exe");
	}

}
