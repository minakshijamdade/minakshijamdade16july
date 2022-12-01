package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//main class or test class

public class UpstoxLoginTest
{
  public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
  
  {
	  
	  FileInputStream file=new FileInputStream("G:\\Velocity soft testing\\16th_july.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");
	
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		UpstoxLogin1Page login1=new UpstoxLogin1Page(driver);
		
		login1.inpUpstoxLogin1PageUN(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpUpstoxLogin1PagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickUpstoxLogin1Pageloginbtn();
		
		UpstoxLogin2Page login2=new UpstoxLogin2Page(driver);
		login2.inpUpstoxLogin2Pageyob(sh.getRow(0).getCell(2).getStringCellValue());
		
		UpstoxWelcomePage wel=new UpstoxWelcomePage(driver);
			wel.clickupstoxwelcomepagenoamgood();
		
		
		UpstoxHomePage home=new UpstoxHomePage(driver);
		
		home.verifyupstoxhomepageuserid(sh.getRow(0).getCell(3).getStringCellValue());
		
		
		Thread.sleep(3000);
		
		driver.close();
		
}
}
