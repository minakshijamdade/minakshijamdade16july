package Pom_Ddf_TestNG_Baseclass_UtilityClass;

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

public class UpstoxLoginTest1 extends BaseClass
{
   
	   UpstoxLogin1Page login1;
	   UpstoxLogin2Page login2;
	   UpstoxWelcomePage wel;
	   UpstoxHomePage home;
	   UpstoxLogoutpage logout;
	   
	   
	   @BeforeClass
	   
	   public void Openbrowser() throws EncryptedDocumentException, IOException
	   {
		      initializebrowser();
		       
			 login1=new UpstoxLogin1Page(driver);
			  
			 login2=new UpstoxLogin2Page(driver);
			 
			wel=new UpstoxWelcomePage(driver);
			
			home=new UpstoxHomePage(driver);
			
			logout=new  UpstoxLogoutpage(driver);
				 
		 }
	   
	   
	   @BeforeMethod
	   
	   public void loginToApp() throws EncryptedDocumentException, IOException
	   {
		   
		  
		    login1.inpUpstoxLogin1PageUN(UtilityClass.GetTD(0, 0));
		  
			login1.inpUpstoxLogin1PagePWD(UtilityClass.GetTD(0, 1));
			
			login1.clickUpstoxLogin1Pageloginbtn();
			
			login2.inpUpstoxLogin2Pageyob(UtilityClass.GetTD(0, 2));
			
			wel.clickupstoxwelcomepagenoamgood();
			
		}
	  
	   
	   @Test
	   public void verifyuserid() throws EncryptedDocumentException, IOException
	   {
		   
		   String actpn=home.getupstoxhomepageActPN();
		   
		   String exppn = UtilityClass.GetTD(0, 3);
		   
		   Assert.assertEquals(actpn,exppn,"Failed:both results are different");
		   
	   }
	   
	   
	   
	   
	   @AfterMethod
	   public void logoutFromapp()
	   {
		   
		   logout.clickUpstoxusername();
		   logout.clickUpstoxlogout();
	   }
	   
	   @AfterClass
	   
	   public void closeBrowser()
	   {
		   
		   driver.quit();
	   }
	   
   }   


