package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_keyword4_Timeout

{
	@Test(timeOut=5000)
    public void TC1() throws InterruptedException 
    {
		Thread.sleep(6000);
   	 Reporter.log("Running TC1", true);
    }

  @Test
  public void TC2()
 {
	 
	 Reporter.log("Running TC2", true);
   }
}
