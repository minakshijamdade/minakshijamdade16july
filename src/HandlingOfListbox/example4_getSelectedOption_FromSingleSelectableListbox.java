package HandlingOfListbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class example4_getSelectedOption_FromSingleSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
		
//		WebElement selectedOption = s.getFirstSelectedOption();
//		String text = selectedOption.getText();
//		System.out.println(text);

	}


}
