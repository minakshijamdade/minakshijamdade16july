package POM_with_Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxlogintest1page
{
  public static void main(String[] args) throws InterruptedException 
  
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		upstoxlogin11page login1=new upstoxlogin11page (driver);
		login1.enterun();
		
		login1.enterpwd();
		
		login1.clicklogin();
		
		upstoxlogin22page login2=new upstoxlogin22page (driver);
		
		login2.enteryob();
		
		
		upstoxwelcome1page wel=new upstoxwelcome1page(driver);
						
	    wel.clickonnoamgood();
		
		
		upstoxhomepage1 home=new upstoxhomepage1(driver);
		
		home.verifyuid();
		
		
		
		Thread.sleep(5000);
		
		
		driver.close();
		
}
}
