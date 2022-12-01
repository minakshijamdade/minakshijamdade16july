package Ddf_Pom_TestNG_BUClass_PropertyFile_FailedTCSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class2

public class UpstoxWelcomePage 

{
  @FindBy(xpath="//div[text()='No, I’m good']")private WebElement noamgood;
  
  public UpstoxWelcomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  
  public void clickupstoxwelcomepagenoamgood()
  {
	  
	  noamgood.click();
  }
  
  
  
}
