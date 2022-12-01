package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_Assertclass3_asserttrue 
{
	@Test
   public void asserttrue()
   {
	   
	   boolean actresult=false;
	   Assert.assertTrue(actresult,"Failed:Actual result is false");
   }
}
