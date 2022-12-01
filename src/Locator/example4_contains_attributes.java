package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_contains_attributes

{
public static void main(String[] args) 

{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("agsghh");
	
	driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("sdhhf");
}
}
