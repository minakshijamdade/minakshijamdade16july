package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3_getColSize
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 

{
	FileInputStream file=new FileInputStream("G:\\Velocity soft testing\\16th_july.xlsx");
	
	int colsize=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
	
	System.out.println(colsize);
		
}


}
