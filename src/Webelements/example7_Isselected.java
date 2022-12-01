package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_Isselected
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//click on create new acc link
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(3000);
	
	boolean result=driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
	
	
	System.out.println(result);
	
	if(result==true)
	{
		
		System.out.println("redio button selected");
	}
	
	else
	{
		
		System.out.println("radio button de-Selected");
	}
	
}
}
