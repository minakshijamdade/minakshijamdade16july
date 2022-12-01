package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example11_parallel1
{
  @Test
  
  public void OpenFaceboox() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  Thread.sleep(3000);
	  
	  driver.close();
	  
	  
	  
	  
  }
}
