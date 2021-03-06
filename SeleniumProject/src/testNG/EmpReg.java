package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg extends TestMaster
{
	@Test(dataProvider="data")
	public void org_EmpReg(String f, String l, String eId)
	{
		System.out.println(f+"---"+l+"----"+eId);
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eId);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Empreg Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] d=new Object[3][3];
		
		d[0][0]="Venkat";
		d[0][1]="Ch";
		d[0][2]="9874";
		
		d[1][0]="Sandeep";
		d[1][1]="G";
		d[1][2]="9875";
		
		d[2][0]="Manikanta";
		d[2][1]="G";
		d[2][2]="9876";
		
		return d;
		
	}

}
