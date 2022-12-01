package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword1_invocationcount 

{
	@Test(invocationCount=2)
   public void TC1()
   {
	   
	   Reporter.log("Running Test case1", true);
   }
}
