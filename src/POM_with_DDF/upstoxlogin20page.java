package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin20page 

{
   @FindBy(xpath="\"//input[@id='yob']")private WebElement yearofbirth;
   
   
   public upstoxlogin20page( WebDriver driver)
   {
 	  PageFactory.initElements(driver,this);
   }
   
   
   public void inpupstoxlogin20pageyob(String yob) 
   {
	   
	   yearofbirth.sendKeys(yob);
   }
   
}
