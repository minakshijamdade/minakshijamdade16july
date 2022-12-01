package Ddf_Pom_TestNG_BUClass_PropertyFile_FailedTCSS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
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
	   int TCID;
	   
	   
	   @BeforeClass
	   
	   public void Openbrowser() throws EncryptedDocumentException, IOException
	   {
		      initializebrowser();
		       
			 login1=new UpstoxLogin1Page(driver);
			  
			 login2=new UpstoxLogin2Page(driver);
			 
			wel=new UpstoxWelcomePage(driver);
			
			home=new UpstoxHomePage(driver);
				 
		 }
	   
	   
	   @BeforeMethod
	   
	   public void loginToApp() throws EncryptedDocumentException, IOException
	   {
		   
		  
		    login1.inpUpstoxLogin1PageUN(UtilityClass.getPFData("UN"));
		  
			login1.inpUpstoxLogin1PagePWD(UtilityClass.getPFData("PWD"));
			
			login1.clickUpstoxLogin1Pageloginbtn();
			
			login2.inpUpstoxLogin2Pageyob(UtilityClass.getPFData("YOB"));
			
			wel.clickupstoxwelcomepagenoamgood();
			
		}
	  
	   
	   @Test
	   public void verifyuserid() throws EncryptedDocumentException, IOException
	   {
		   TCID=101;
		   
		   String actpn=home.getupstoxhomepageActPN();
		   
		   String exppn = UtilityClass.GetTD(0, 2);
		   
		   Assert.assertEquals(actpn,exppn,"Failed:both results are different");
		   
	   }
	   
	   
	    @AfterMethod
	   public void logoutfromapp(ITestResult s1) throws IOException
	   {
		  if(s1.getStatus()==ITestResult.FAILURE)
		  {
			  
			  
			  UtilityClass.capturescreenshot(driver, TCID);
		  }
		  
		  //logout code
		   
	   }
	   
	   @AfterClass
	   
	   public void closeBrowser()
	   {
		   
		   driver.quit();
	   }
	   
   }   


