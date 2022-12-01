package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_xpathbyIndex1

{
public static void main(String[] args) throws InterruptedException

{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(2000);
	
	
	
	   //Enter FN
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		
		
		//Enter LN
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
				
		//Enter Mob No
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("345879087");
				
			

	}


	
	
	
}

