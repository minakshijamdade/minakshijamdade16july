package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class example4_switchTomainpageFromChild 
{
public static void main(String[] args) throws InterruptedException

{
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 
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
	   
	   //switch to main page
	   
	   driver.switchTo().window(al.get(0));    //String main page id
	   
	   Thread.sleep(3000);
	   
	   //click on new window from main page
	   
	   
	   
	   driver.findElement(By.xpath("//input[@name='NewTab']")).click();
}
}
