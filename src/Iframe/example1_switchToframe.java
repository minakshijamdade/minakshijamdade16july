package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_switchToframe 

{
public static void main(String[] args)
{
    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	
	//switch to frame
	
	//driver.switchTo().frame("iframeResult") ; //string frame name
	//driver.switchTo().frame("iframeResult");
	//driver.switchTo().frame(0);                 //int frame index
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));   //webelement
	
	//click on data and time btn from  iframe
	
	  driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
	
	
}
}
