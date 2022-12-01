package Locator;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xpathByAttribute
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement("locator")
		//driver.findElement(By.xpath("String xpathExpression"))
		
		//enter UN
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("minakshi.lonkar1@gmail.com");
				
		//enter pwd
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("101010");
			
		//click on login btn
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}





}
