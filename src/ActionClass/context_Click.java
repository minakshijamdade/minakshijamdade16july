package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class context_Click 
{
  public static void main(String[] args) throws InterruptedException 
  
  {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	   driver.get("https://www.flipkart.com/");
       //click on close button
	   
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   
	   Thread.sleep(3000);
	   
	   WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act=new Actions(driver);
		
    //		act.moveToElement(loginBtn).perform();
    //		act.contextClick().perform();
		
	//	act.moveToElement(loginBtn).contextClick().build().perform();
		


	   
	   act.contextClick(loginBtn).perform();
	   
}
}
