package Framework;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class example2_ddf1
	{
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
		{
			
		FileInputStream file=new FileInputStream("G:\\Velocity soft testing\\16th_july.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
			
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//enter un
		
		
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		
		
		//enter pwd
		
			
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
			
		
		//click on login btn
			
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			
	        boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
			
			if(result==true)
			{
				
				System.out.println("Logo Found=>Test case pass");
			}
			
			else
			{
				
				System.out.println("Logo Not Found=>Test case fail");
			}
			
			
			Thread.sleep(3000);
			
			
			//click on open menu
			
			
			driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
			
			//click on logout btn
			
			
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					
					
					Thread.sleep(5000);
					driver.close();
		
		
		}
	}


