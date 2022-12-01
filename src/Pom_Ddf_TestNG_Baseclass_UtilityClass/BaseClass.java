package Pom_Ddf_TestNG_Baseclass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
   WebDriver driver;
   
   public void initializebrowser()
   {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		  
		 driver=new ChromeDriver();
		
		driver.get("https://login-v2.upstox.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	   
	   
   }
}
