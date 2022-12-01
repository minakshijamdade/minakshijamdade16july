package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_Alertpopup2

{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.demo.guru99.com/test/delete_customer.php");
		 
		 //enter customer id
		 
		 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		 
		 
		 
		 //click on submit button
		 
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		 
		 
		 
		 //Switch to alert popup
		 
		Alert alt = driver.switchTo().alert();
		//Gettext from alert popup
		Thread.sleep(3000);
		
		String text = alt.getText();
		System.out.println(text);
		
		//click on cancle button from alert popup
		
		//alt.dismiss();
		
		//click on ok button
		alt.accept();
		Thread.sleep(3000);
		
		//click on button from 2nd alert popup
		
		alt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
}
}
