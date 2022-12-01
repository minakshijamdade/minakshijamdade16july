package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	
	   driver.get("https://www.facebook.com/");
	   
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	   //click on create new account link
	   
	   driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	   
	   //enter FN
	   
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Minakshi");
	   
}
}
