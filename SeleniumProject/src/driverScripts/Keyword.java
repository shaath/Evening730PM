package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Keyword 
{

	@Test
	public void test() throws IOException
	{
		OrgMaster om=new OrgMaster();
		String res=null;
		String xlpath="F:\\Evening730pm\\SeleniumProject\\src\\testData\\Keyword.xlsx";
		String xlout="F:\\Evening730pm\\SeleniumProject\\src\\results\\Keyres1.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++) 
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tcId.equalsIgnoreCase(tstcId)) 
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
							
							break;
						case "login":	
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							res=om.org_Empreg("Sharath", "Chandra", "9574");
							break;
						case "Usereg":
							res=om.org_Userreg("Sharath Chandra", "SharathChandra123", "SharathChandra123", "SharathChandra123");
							break;
						case "Ulogin":
							res=om.org_Login("SharathChandra123", "SharathChandra123");
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						//Result updation in teststeps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						//Result updation in testcase sheet
						if (!ws.getRow(i).getCell(3).getStringCellValue().equals("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
				
			}
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}
}
