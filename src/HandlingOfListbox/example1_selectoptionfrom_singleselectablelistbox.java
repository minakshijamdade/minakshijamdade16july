package HandlingOfListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectoptionfrom_singleselectablelistbox 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//click on create new account
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	
	Thread.sleep(3000);
	
	//step1
	
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	
	
	//step2
	Select s=new Select(month);
	
	
	//step3
	
	//s.selectByVisibleText("Dec");   //String text
	
	s.selectByValue("12");
	
	s.selectByIndex(3);
	
	
	
}
}

