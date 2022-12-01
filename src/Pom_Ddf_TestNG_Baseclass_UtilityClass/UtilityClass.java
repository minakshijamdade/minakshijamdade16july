package Pom_Ddf_TestNG_Baseclass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
    //@author name=Minakshi
	//This method is used to get test data from exelsheet;
	//need to pass 2 inputs:1.rowindex,2.colindex
	
	public static String GetTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		
		 FileInputStream file=new FileInputStream("G:\\Velocity soft testing\\16th_july.xlsx");
				 
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");
		   
		 String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		  
		return value;
	}
}
