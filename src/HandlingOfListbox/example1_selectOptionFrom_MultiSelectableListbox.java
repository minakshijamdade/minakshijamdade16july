package HandlingOfListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class example1_selectOptionFrom_MultiSelectableListbox 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///G:/HTML%20PROGRAMS/listbox.html");
	
	//step1: 
			WebElement selectCountry = driver.findElement(By.xpath("//select[@id='abcd']"));
			
			//step2: 
			Select s=new Select(selectCountry);
			
			//step3: 
//			s.selectByVisibleText("Ind");
//			s.selectByVisibleText("Sri");
			s.selectByIndex(0);
			s.selectByIndex(2);
		//	s.selectByValue("");



}
}
