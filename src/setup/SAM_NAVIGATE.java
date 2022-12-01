package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAM_NAVIGATE 

{
   public static void main(String[] args) throws InterruptedException
   
   {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.youtube.com/");
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
   }
}
