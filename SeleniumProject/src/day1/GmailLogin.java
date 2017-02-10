package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) 
	{
		//Launching the firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		// Launching gmail applicaion
		driver.get("http://gmail.com");
		//Maximize the window
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identifying the email textbox
		WebElement email=driver.findElement(By.id("Email"));
		
		//Sending the text into email text box
		
		email.sendKeys("sharathqedge449");
//		Sleeper.sleepTightInSeconds(5);
		//Deleting the text from text box
		
//		email.clear();
		
		//Clicking on the Next button
		
		driver.findElement(By.name("signIn")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		//Entering the text into the password textbox
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		//Clicking on signin button
		
		driver.findElement(By.cssSelector("#signIn")).click();
		
		

	}

}
