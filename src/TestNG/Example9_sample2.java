package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example9_sample2 

{
	@Test
    public void TC5()   //TC1=test case or test method
    {
    	
    	Reporter.log("running test case5", true);
    }
	@Test
	public void TC6()
	{
		
		Reporter.log("running test case6",true);
	}
	@Test
	public void TC7()
	{
		
		Reporter.log("running test case7", true);
	}
	
	@Test
    public void TC8()   //TC1=test case or test method
    {
    	
    	Reporter.log("running test case8", true)
    }
}
