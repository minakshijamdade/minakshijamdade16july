package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2

{
  public static void main(String[] args) 
  
  {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//driver.findElement("Locator");
	//driver.findElement(By.xpath(String "xpathExpression"));
	
	//enter UN
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
	
	
	//enter password
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1010");
	
	
	//Click login
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
}
}
