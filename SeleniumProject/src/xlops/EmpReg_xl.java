package xlops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmpReg_xl {

	public static void main(String[] args) throws IOException 
	{
		OrgMaster om=new OrgMaster();
		String xlpath="F:\\Evening730pm\\SeleniumProject\\src\\testData\\EmpData.xlsx";
		String xlout="F:\\Evening730pm\\SeleniumProject\\src\\results\\EmpRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
//		XSSFRow r=ws.getRow(1);
//		XSSFCell c=r.getCell(1);
//		
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		System.out.println(rc);
		om.org_Launch("http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.getCell(2);
			XSSFCell c3=r.createCell(3);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String eId=c2.getStringCellValue();
			
			System.out.println(f+"----"+l+"-----"+eId);
			
			String res=om.org_Empreg(f, l, eId);
			
			
			c3.setCellValue(res);
			
		}

		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

}
