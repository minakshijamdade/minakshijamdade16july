package Pom_Ddf_TestNG_Baseclass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage 

{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement PN;
	
	
	public UpstoxHomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public String getupstoxhomepageActPN()
	{
		String text=PN.getText();
		
		return text;
		
	}


}
