package POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxlogintest10page 

{
  public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
  {
	FileInputStream file=new FileInputStream("G:\\\\Velocity soft testing\\\\16th_july.xlsx");
	Sheet sh1 = WorkbookFactory.create(file).getSheet("DDF1");

	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://login-v2.upstox.com/");
	
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	upstoxlogin10page login1=new upstoxlogin10page (driver);
	login1.inpupstoxlogin10pageenterun(sh1.getRow(0).getCell(0).getStringCellValue());
	
	login1.inpupstoxlogin10pageenterpwd(sh1.getRow(0).getCell(1).getStringCellValue());
	
	login1.clickupstoxlogin10pagelogin();
	
	
	 upstoxlogin20page login2=new  upstoxlogin20page(driver);
	 login2.inpupstoxlogin20pageyob(sh1.getRow(0).getCell(2).getStringCellValue());
	 
	 upstoxwelcome10page wel=new upstoxwelcome10page(driver);
		wel.clickupstoxwelcome10pagenoamgood();
		
		
		upstoxhome10page home1=new upstoxhome10page(driver);
		
		home1.verifyupstoxhome10pageuerid(sh1.getRow(0).getCell(3).getStringCellValue());
		
		Thread.sleep(3000);
		
		driver.close();
			 
			 
	
	
}
}