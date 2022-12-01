package setup;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openFirefoxBrowser 

{
  public static void main(String[] args) 
  
  {
	
	  System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	  FirefoxDriver driver=new FirefoxDriver();
	  
	  
	  driver.get("https://www.facebook.com/");
}
}
