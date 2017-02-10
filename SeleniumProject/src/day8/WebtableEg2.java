package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtableEg2 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		
		System.out.println("The number of rows are available in table "+rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
//			System.out.println(rows.get(i).getText());
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("The number of cilumns available in "+i+" row is "+cols.size());
			
			String id=cols.get(1).getText();
			System.out.println(id);
			if (id.equals("0008"))
			{
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}

	}

}
