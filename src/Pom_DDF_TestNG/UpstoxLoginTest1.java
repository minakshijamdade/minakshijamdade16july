package Pom_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpstoxLoginTest1 
{
   
	   UpstoxLogin1Page login1;
	   UpstoxLogin2Page login2;
	   UpstoxWelcomePage wel;
	   UpstoxHomePage home;
	   //UpstoxLogoutpage logout;
	   Sheet sh;
	   WebDriver driver;
	   int a;  //declare globally
	   
	   
	   @BeforeClass
	   
	   public void Openbrowser() throws EncryptedDocumentException, IOException
	   {
		   FileInputStream file=new FileInputStream("G:\\Velocity soft testing\\16th_july.xlsx");
			   sh = WorkbookFactory.create(file).getSheet("DDF1");
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			  //System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
				
			    driver=new ChromeDriver();
				
				driver.get("https://login-v2.upstox.com/");
				
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				 login1=new UpstoxLogin1Page(driver);
				 login2=new UpstoxLogin2Page(driver);
				 wel=new UpstoxWelcomePage(driver);
				 home=new UpstoxHomePage(driver);
				// logout=new UpstoxLogoutpage(driver);
				 
		      a=10; //initialize locally
	   }
	   
	   
	   @BeforeMethod
	   
	   public void loginToApp()
	   {
		   
		   System.out.println(a); 
		    login1.inpUpstoxLogin1PageUN(sh.getRow(0).getCell(0).getStringCellValue());
		  
			login1.inpUpstoxLogin1PagePWD(sh.getRow(0).getCell(1).getStringCellValue());
			
			login1.clickUpstoxLogin1Pageloginbtn();
			//logout.clickUpstoxlogout();
			
			login2.inpUpstoxLogin2Pageyob(sh.getRow(0).getCell(2).getStringCellValue());
			
			wel.clickupstoxwelcomepagenoamgood();
			
			

}
	   
	   @Test
	   public void verifyuserid()
	   {
		   
		   String actpn=home.getupstoxhomepageActPN();
		   
		   String expPN = sh.getRow(0).getCell(3).getStringCellValue();
		   
		   Assert.assertEquals(actpn,expPN,"Failed:both results are different");
		   
	   }
	   
	   
	   
	   
	   @AfterMethod
	   public void logoutApp()
	   {
		  //logout.clickUpstoxusername(); 
		   //logout.clickUpstoxlogout();
	   }
	   
	   @AfterClass
	   
	   public void closeBrowser()
	   {
		   
		   driver.quit();
	   }
	   
   }   


