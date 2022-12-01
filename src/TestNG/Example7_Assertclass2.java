package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_Assertclass2 
{
	
	 @Test
	  public void assertnotequals()
	  {
	    String actresult="Hi";
	     String expresult="Hi";
	  
	    Assert.assertNotEquals(actresult, expresult,"Fail:Both Result are same");
}
}