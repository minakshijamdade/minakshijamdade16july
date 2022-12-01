package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class example1_getNumeracDataFromExcelSheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 

{
	FileInputStream file=new FileInputStream("G:\\\\Velocity soft testing\\\\16th_july.xlsx");
	
	double value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	
	System.out.println(value);
	
}
}
