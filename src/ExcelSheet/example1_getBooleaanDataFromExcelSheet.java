package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getBooleaanDataFromExcelSheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 

{
	FileInputStream file=new FileInputStream("G:\\\\Velocity soft testing\\\\16th_july.xlsx");
	
	boolean value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
	
	System.out.println(value);
}
}
