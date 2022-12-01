package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_Assertclass4_assertFalse 
{
	@Test
	public void asserEquals() 
	{
		boolean actResult=true;
		Assert.assertFalse(actResult,"Failed-> actResult is true : ");
	
	}
	
	
	

}
