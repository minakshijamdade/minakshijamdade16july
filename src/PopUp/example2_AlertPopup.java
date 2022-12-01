package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_AlertPopup 
{
   public static void main(String[] args) 
   {
	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.demo.guru99.com/test/delete_customer.php");
	 
	 //enter customer id
	 
	 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
	 
	 
	 
	 //click on submit button
	 
	 driver.findElement(By.xpath("//input[@name='submit']")).click();
	 
	 //click on cancle button from alert popup
	 driver.switchTo().alert().dismiss();
	// 
	 //Gettext from Alert popup
	 
	String text = driver.switchTo().alert().getText();
	 System.out.println(text);
	 
	 //click on ok button from alert popup
	 
	 driver.switchTo().alert().accept();
	 
	 //click on ok button of 2nd popup
	 driver.switchTo().alert().accept();
	 
	 
	 
	 
  }
}
