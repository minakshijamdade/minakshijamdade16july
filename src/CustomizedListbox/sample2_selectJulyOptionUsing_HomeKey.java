package CustomizedListbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample2_selectJulyOptionUsing_HomeKey
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();

	     driver.get("https://www.facebook.com/");
	     
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	     
	     //step1=identify month
	     
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	     
	     //step2=create object of action class
	     
	     Actions act=new Actions(driver);
	     //step 3
	     
	     act.click(month).perform();
	     
	     Thread.sleep(3000);
	     
	     //navigate to 1st option using Home key
	     
	     act.sendKeys(Keys.HOME).perform();
	     Thread.sleep(3000);
	     //Navigate to july option using Arrow down
	     
	     for(int i=1;i<=6;i++)
	     {
	    	 
	    	 act.sendKeys(Keys.ARROW_DOWN).perform();
	     }
	     
	     Thread.sleep(3000);
	     
	   //select option using enter key
	     
	     act.sendKeys(Keys.ENTER).perform();
	     
	     
	     
}
}
