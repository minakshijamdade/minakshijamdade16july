package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class example2_clear
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
	
	//Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//input[@id='email']")).clear();
	//Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
	//Thread.sleep(2000);
	
	
	WebElement UN=driver.findElement(By.xpath("//input[@id='email']"));
	UN.sendKeys("abcd");
	
	Thread.sleep(2000);
	UN.clear();
	Thread.sleep(2000);
	UN.sendKeys("xyz");
	
	
}
}
