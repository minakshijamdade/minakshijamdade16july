package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;



public class sam7_minimize

{
public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.google.com/mail/u/0/?ogbl");
		
		driver.manage().window().minimize();
		
		//Options s1=driver.manage();
		//Window s2=s1.window();
		//s2.minimize();
		
		
	}



}



