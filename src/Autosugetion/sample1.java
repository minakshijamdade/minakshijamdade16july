package Autosugetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
   public static void main(String[] args) throws InterruptedException
   
   {
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		//enter mob no
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(1000);
		
		 List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		 
		 String exptext="redmi k50i";
		 
		 for(WebElement s1:alloptions)
		 {
			 
			 String acttext = s1.getText();
			 
			 if(exptext.equals(acttext))
			 {
				 
				 s1.click();
				 break;
			 }
			 
			 
		 }
		
}
}
