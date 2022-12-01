package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_keyword5_dependsonmethod2 
{
	@Test
	   public void login1()
	   {
		   
		   Reporter.log("Running login1 TC",true);
	   }
		
	@Test
	   public void login2()
	   {
		   
		   Reporter.log("Running login2 TC",true);
	   }
	
		@Test(dependsOnMethods= {"login1","login2"})
		   public void logout()
		   {
			   
			   Reporter.log("Running logout TC",true);
		   }
			
}
