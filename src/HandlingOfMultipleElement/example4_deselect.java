package HandlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_deselect
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	   	
	   	WebDriver driver=new ChromeDriver();
	   	
	   	driver.get("file:///G:/HTML%20PROGRAMS/multiplecheckbox.html");
	   	
	   	List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	   	
	   	
	   	for( WebElement d:allcheckboxes)
	   		
	   	{
	   		
	   	   d.click();
	   	
	   	  Thread.sleep(500);
	   	}
	   	
	   	
	   	for(int i=allcheckboxes.size()-1;i>=0;i--)
	   	{
	   		
	   		allcheckboxes.get(i).click();
	   	}
}
}
