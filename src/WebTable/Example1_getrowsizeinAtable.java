package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getrowsizeinAtable
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///G:/HTML%20PROGRAMS/Webtable.html");
		
		 int allrowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		
		System.out.println(allrowsize);
		
		//List<WebElement> rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		
		//int s = rowsize.size();
		
		//System.out.println(s);
		
}
}
