package HandlingOfListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class example5_getAllSelectedOptions_FromMultiSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/HTML%20PROGRAMS/listbox.html");
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='abcd']"));
		Select s=new Select(selectCountry);
		
		s.selectByIndex(2);
		s.selectByIndex(0);
		s.selectByIndex(1);
		
		List<WebElement> allOptions = s.getAllSelectedOptions();
		for(WebElement s1:allOptions)
		{
			System.out.println(s1.getText());
		}
		

	}


}
