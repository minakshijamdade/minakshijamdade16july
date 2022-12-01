package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_Tagname 
{
   public static void main(String[] args)
   {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///G:/HTML%20PROGRAMS/locator1.html");
	
	//enter FN
	
	driver.findElement(By.tagName("input")).sendKeys("abc");
	
	
	
	//enter LN
	
	driver.findElement(By.tagName("input")).sendKeys("xyz");
  }
}
