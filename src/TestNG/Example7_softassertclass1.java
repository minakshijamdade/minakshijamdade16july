package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Example7_softassertclass1 
{
	@Test
 public void TC()
 {
	SoftAssert soft=new SoftAssert();
     boolean actresult1=true;
     
     soft.assertFalse(actresult1,"Failed:Actual result true");
     
     
     String actresult="Hi";
	  String expresult="Hello";
	  
	  soft.assertEquals(actresult, expresult,"Failed:both results are different:");
	  
	  soft.assertAll();
}
}