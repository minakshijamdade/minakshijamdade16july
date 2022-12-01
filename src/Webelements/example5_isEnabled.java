package Webelements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isEnabled 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(result);
		
		
		if(result==true)
		{
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("Element is disabled");
		}
		
		
	}

}
