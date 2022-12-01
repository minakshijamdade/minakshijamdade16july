package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class example1_HandlingOfDropdown 
{
    public static void main(String[] args) 
    {
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
    		
	     WebDriver driver=new ChromeDriver();
	
	     driver.get("https://www.flipkart.com/");
	   
	   
	      //click on close button
	   
	      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   
	      //step1
	     
	       WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"));
	   
	      //step2
	   
	       Actions act =new Actions(driver);
	   
	   
	      //step3
	   
	       act.moveToElement(loginbtn).perform();
	       
	       driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
	      
          	   
	}
}
