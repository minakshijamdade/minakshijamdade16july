package Ddf_Pom_TestNG_BUClass_PropertyFile_FailedTCSS;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
   WebDriver driver;
   
   public void initializebrowser() throws IOException
   {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\MINAKSHI\\eclipse-workspace\\selenium\\BrowserFile\\chromedriver.exe");
		
		  
		 driver=new ChromeDriver();
		
		driver.get(UtilityClass.getPFData("URL"));
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	   
	   
   }
}
