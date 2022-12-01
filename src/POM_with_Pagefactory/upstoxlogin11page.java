package POM_with_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin11page 

{
	@FindBy(xpath="//input[@id='userCode']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//div[text()='Sign into Upstox']") WebElement loginbtn;
	
	
	
	public upstoxlogin11page(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	public void enterun()
	{
		
		UN.sendKeys("HF6115");
	}
	
	public void enterpwd()
	{
		
		PWD.sendKeys("Rutu@3333");
	}
	
	public void clicklogin()
	{
		
		loginbtn.click();
	}
	
}
