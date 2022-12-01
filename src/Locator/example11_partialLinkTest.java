package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11_partialLinkTest

{
public static void main(String[] args) throws InterruptedException

{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
driver.get("file:///G:/HTML%20PROGRAMS/locator5.html");
	
	Thread.sleep(2000);
	
	//click on facebook link
	
	
	driver.findElement(By.partialLinkText("face")).click();
	
	
}
}
