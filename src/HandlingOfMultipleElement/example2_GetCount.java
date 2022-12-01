package HandlingOfMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_GetCount 
{
    public static void main(String[] args) 
    
    {
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.facebook.com/");
    	
		
//    	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//    	int size = allLinks.size();
//    		System.out.println(size);
    	
    	int c = driver.findElements(By.xpath("//a")).size();
    	
    	
    	System.out.println(c);
    		

	}
}
