package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_keyword3_priority1


//low priority run first
{   @Test(priority=0)
   public void TC3()
   {
	   
	   Reporter.log("Running TC3", true);
   }


   @Test(priority=1)

   public void TC2()
  {
	   
	   Reporter.log("Running TC2", true);
	   
   } 
   @Test(priority=2)
  public void TC1()
  {
	   
	   Reporter.log("Running TC1", true);
   }
}
