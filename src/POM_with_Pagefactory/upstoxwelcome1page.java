package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxwelcome1page
{

@FindBy(xpath="//div[text()='No, I’m good']")private WebElement noamgood;


public upstoxwelcome1page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}



public void clickonnoamgood()
{
	noamgood.click();
}

}
