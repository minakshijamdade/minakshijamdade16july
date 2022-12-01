package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_grouping1 
{
	@Test(groups="wishlist")
    public void TC1()   //TC1=test case or test method
    {
    	
    	Reporter.log("running test case1", true);
    }
	@Test(groups="wishlist")
	public void TC2()
	{
		
		Reporter.log("running test case2",true);
	}
	@Test(groups="profile")
	public void TC3()
	{
		
		Reporter.log("running test case3", true);
	}
	
	@Test(groups="fund")
    public void TC4()   
    {	
    	Reporter.log("running test case4", true);
    }
}
