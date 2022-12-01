package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9_name 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///G:/HTML%20PROGRAMS/locator4.html");
	
	driver.findElement(By.name("1111")).sendKeys("abc123");
	
	
	driver.findElement(By.name("1111")).sendKeys("xyz123");
	
}
}
