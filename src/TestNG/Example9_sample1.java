
package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example9_sample1 

{
	@Test
    public void TC1()   //TC1=test case or test method
    {
    	
    	Reporter.log("running test case1", true);
    }
	@Test
	public void TC2()
	{
		
		Reporter.log("running test case2",true);
	}
	@Test
	public void TC3()
	{
		
		Reporter.log("running test case3", true);
	}
	
	@Test
    public void TC4()   //TC1=test case or test method
    {
    	
    	Reporter.log("running test case4", true);
    }
	
}


