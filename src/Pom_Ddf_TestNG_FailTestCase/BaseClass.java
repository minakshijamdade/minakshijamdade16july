package Pom_Ddf_TestNG_FailTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
   WebDriver driver;
   
   public void initializebrowser()
   {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\MINAKSHI\\eclipse-workspace\\selenium\\BrowserFile\\chromedriver.exe");
		
		  
		 driver=new ChromeDriver();
		
		driver.get("https://login-v2.upstox.com/");
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	   
	   
   }
}
