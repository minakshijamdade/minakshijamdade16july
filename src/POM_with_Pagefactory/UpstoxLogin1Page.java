package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class1

public class UpstoxLogin1Page

{
  //step1:variable declaration
	
	
	@FindBy(xpath="//input[@id='userCode']")private WebElement UN;  //private Webelement UN=driver.findElement(By.xpath(""));
	
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;   //private Webelement PWD=driver.findElement(By.xpath(""));
	
	@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement Loginbtn;   ////private Webelement loginbtn=driver.findElement(By.xpath(""));
	
	
	
	//step2:Variable initialisation
	
	public UpstoxLogin1Page(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	//step3:variable usage
	
	public void enterUN()
	{
		
		UN.sendKeys("HF6115");
	}
	
	public void enterPWD()
	{
		
		PWD.sendKeys("Rutu@3333");
	}
	
	
	public void clickonlogintn()
	{
		Loginbtn.click();
	
	}
	
}
