package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Without_ddf
{
  public static void main(String[] args) throws InterruptedException 
  
  {
	    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//enter un
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		
		
		
		
		//enter pw
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		
		//click on login
		
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
		
		boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		
		if(result==true)
		{
			
			System.out.println("Logo Found=>Test case pass");
		}
		
		else
		{
			
			System.out.println("Logo Not Found=>Test case fail");
		}
		
		
		Thread.sleep(3000);
		
		
		//click on open menu
		
		
		driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		
		
		//click on logout btn
		
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		
				
}
}
