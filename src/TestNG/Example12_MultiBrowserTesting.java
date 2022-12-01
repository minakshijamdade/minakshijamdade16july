

package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example12_MultiBrowserTesting 
{   
	@Parameters("browsername")
    @Test
    public void OpenBrowser(String browsername) throws InterruptedException
    {
    	WebDriver driver=null;
    	
    	
    	
		if(browsername.equals("chrome"))
    	{
    		
    		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
    		
   	       driver=new ChromeDriver();
   	
    	}
    	
    	
    	else if(browsername.equals("firefox"))
    	{
    		 System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.32.0-win64\\geckodriver.exe");
    		 
    		 driver=new FirefoxDriver();
    		  
    		
    	}	
    		
    	else if(browsername.equals("edge"))
    	{
    		 System.setProperty("webdriver.edge.driver", "");
    		 
    		 driver=new EdgeDriver();
    		  
    		
    	}
		
		
		driver.get("https://www.facebook.com/");
		
    	driver.manage().window().maximize();
    	
    	Thread.sleep(3000);
    	
    	driver.quit();
    }
}
