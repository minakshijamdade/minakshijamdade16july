package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_HiddenDivision 
{
    public static void main(String[] args) 
    {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	     WebDriver driver=new ChromeDriver();
	
	   driver.get("https://www.flipkart.com/");
	
	   //Enter UN
	
	   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
	   
	   
	   //Enter pw
	   
	   driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("xyz");
	   
	   //click on login page
	   
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
}
  
}
