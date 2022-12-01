package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_GetDataFronIndex 
{
   public static void main(String[] args) 
   
   {
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///G:/HTML%20PROGRAMS/Webtable.html");
		
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[2]")).getText();
		
		System.out.println(text);
		
        String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]")).getText();
		
		System.out.println(text1);
		
		
		 String text3 = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
			
			System.out.println(text3);
			
			String text4 = driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[2]")).getText();		
			System.out.println(text4);
			
		
}
}
