package POM_with_Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//main class or test class

public class UpstoxLoginTest
{
  public static void main(String[] args) throws InterruptedException 
  
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		UpstoxLogin1Page login1=new UpstoxLogin1Page(driver);
		
		login1.enterUN();
		login1.enterPWD();
		login1.clickonlogintn();
		
		
		UpstoxLogin2Page login2=new UpstoxLogin2Page(driver);
		login2.enteryob();
		
		UpstoxWelcomePage wel=new UpstoxWelcomePage(driver);
			wel.clickonnoamgood();
		
		
		UpstoxHomePage home=new UpstoxHomePage(driver);
		
		home.verifyuserid();
		
		
		Thread.sleep(3000);
		
		driver.close();
		
}
}
