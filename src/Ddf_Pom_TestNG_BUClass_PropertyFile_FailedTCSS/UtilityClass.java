package Ddf_Pom_TestNG_BUClass_PropertyFile_FailedTCSS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
    //@author name=Minakshi
	//This method is used to get test data from exelsheet;
	//need to pass 2 inputs:1.rowindex,2.colindex
	
	public static String GetTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		
		 FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\\\16th_july.xlsx");
				 
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");
		   
		 String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		  
		 return value;
	}
	
	
	public static void capturescreenshot(WebDriver driver,int TCID) throws IOException
	{
		
		
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File dest=new File(System.getProperty("user.dir")+"\\FailedTestCaseScreenShot\\Screenshots\\TestCaseID"+TCID+".jpg");
	  
	  FileHandler.copy(src,dest);
	}
	
	
	public static String getPFData(String key) throws IOException
	{
		
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Propertyfile.properties");
		Properties p=new Properties();
		p.load(file);
		
		String value=p.getProperty(key);
		
		return value;
	}
}
