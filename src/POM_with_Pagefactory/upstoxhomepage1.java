package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxhomepage1 

{
   @FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement PN;
   
   
   public upstoxhomepage1(WebDriver driver)
   
   {
	   
	   PageFactory.initElements(driver,this);
   }
   public void verifyuid()
   {  
   String actpn=PN.getText();
   
   String exppn="Ruturaj";
   
   if(actpn.contains(exppn))
   {
	   
	   System.out.println("Pass");
   }
   
   else
   {
	   
	   System.out.println("Fail");
   }
	   
	   
   }
}
