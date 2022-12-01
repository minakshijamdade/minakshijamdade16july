package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example4_TestNGAnnotations 

{
	@BeforeClass
   public void OpenBrowser()
   {
	   
	   Reporter.log("-----open browser----",true);
   }
   
  @BeforeMethod
   public void LogintoApp()
   {
	   
	   Reporter.log("-----Login to app----",true);
   }
   @Test
   public void Verifyuserid1()
   {
	   
	   Reporter.log("-----Running Verify user id1----",true);
   }
   @Test
   public void Verifyuserid2()
   {
	   
	   Reporter.log("-----Running Verify userid2 ----",true);
   }
   @AfterMethod
   public void LogoutApp()
   {
	   
	   Reporter.log("-----Logout App----",true);
   }
   @AfterClass
   public void CloseBrowser()
   {
	   
	   Reporter.log("-----Close browser----",true);
   }
}
