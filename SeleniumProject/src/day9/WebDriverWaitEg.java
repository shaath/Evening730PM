package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver, 40);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/div[2]/div/div[1]/div[3]/div/a")));
		driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[1]/div[3]/div/a")).click();

	}

}
