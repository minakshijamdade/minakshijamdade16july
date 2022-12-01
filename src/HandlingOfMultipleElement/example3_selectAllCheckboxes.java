package HandlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_selectAllCheckboxes 
{
   public static void main(String[] args) throws InterruptedException 
   {
		
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
   	
   	WebDriver driver=new ChromeDriver();
   	
   	driver.get("file:///G:/HTML%20PROGRAMS/multiplecheckbox.html");
   	
   	List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
   	
   	for(WebElement s1:all)
   		
   	{
   		
   		s1.click();
   		Thread.sleep(1000);
   	}
   	

}
   
}
