package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class2
public class UpstoxLogin2Page 
{
    @FindBy(xpath="//input[@id='yob']")private WebElement yearofbirth;



public UpstoxLogin2Page(WebDriver driver)

{
	
PageFactory.initElements(driver,this);

}


public void enteryob()
{
	yearofbirth.sendKeys("1998");
}
}