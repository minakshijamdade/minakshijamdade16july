package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxwelcome10page 
{

	@FindBy(xpath="//div[text()='No, I’m good']")private WebElement noamgood;
	
	
	public upstoxwelcome10page(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	
	
	public void clickupstoxwelcome10pagenoamgood()
	{
		
		noamgood.click();
	}
	
}
