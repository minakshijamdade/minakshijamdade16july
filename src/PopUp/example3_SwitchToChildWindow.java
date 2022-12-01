package PopUp;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_SwitchToChildWindow 

{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exee");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.get("https://skpatro.github.io/demo/links/");
	 
	 //click on new tab from main page
	 
	 driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	 
	 //get child window id
	 
	   Set<String> allids = driver.getWindowHandles();       //{main page id(0),child window id(1)}
	   
	    ArrayList<String> al=new ArrayList<String>(allids);
	    
	   String childwindowid = al.get(1);
	   
	   
	   //switch to child window
	   
	   driver.switchTo().window(childwindowid);   //String child window id
	   
	   
	   //click on Training link from child window;
	   
	   driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	   
	   
	
}
}
