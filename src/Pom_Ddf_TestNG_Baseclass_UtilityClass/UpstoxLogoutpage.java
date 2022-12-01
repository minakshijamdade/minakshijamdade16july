package Pom_Ddf_TestNG_Baseclass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogoutpage

{
	
	
	@FindBy(xpath="//span[text()='minakshi j.']")private WebElement profilename;   ////private Webelement loginbtn=driver.findElement(By.xpath(""));
	@FindBy(xpath="//div[text()='Logout']")private WebElement logout;
	
	
	public UpstoxLogoutpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void clickUpstoxusername()
	{
		profilename.click();
	
	}
	
	public void clickUpstoxlogout()
	{
		
		logout.click();
	}
}
