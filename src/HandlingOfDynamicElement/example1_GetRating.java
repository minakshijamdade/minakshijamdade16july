package HandlingOfDynamicElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_GetRating 
{
     public static void main(String[] args) 
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
 		
 		WebDriver driver=new ChromeDriver();
 		
 		driver.get("https://www.flipkart.com/");
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		//click on close button
 		
 		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z'] ")).click();
 		
 		//Enter mon name
 		
 		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10");
 		
 		
 		//click on search icon
 		
 		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
 		
 		//get rating
 		
 		String rating = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
 		
 		System.out.println(rating);
 		
	}
}
