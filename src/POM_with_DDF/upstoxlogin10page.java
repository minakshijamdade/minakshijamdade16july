package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin10page 
{
	//variable declaration
  @FindBy(xpath="//input[@id='userCode']") WebElement UN;
  @FindBy(xpath="//input[@id='password']")private WebElement PWD;
  @FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement loginbtn;
  
  
  //variable initialisation
  
  public upstoxlogin10page( WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  
  
  //variable usage
  
  public void inpupstoxlogin10pageenterun(String username)
  {
	  
	 UN.sendKeys(username);
  }
  
  public void inpupstoxlogin10pageenterpwd(String password) 
  {
	  
	  PWD.sendKeys(password);
  }
  
  public void clickupstoxlogin10pagelogin()
  {
	  
	 loginbtn.click();
  }
}
