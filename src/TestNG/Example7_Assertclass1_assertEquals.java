package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_Assertclass1_assertEquals 
{
  @Test
  public void assertequals()
  {
	  
	  String actresult="Hi";
	  String expresult="Hello";
	  
	  Assert.assertEquals(actresult, expresult,"Failed:both results are different:");
  }
}
