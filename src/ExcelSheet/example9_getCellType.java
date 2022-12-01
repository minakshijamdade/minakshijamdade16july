package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example9_getCellType 

{
   public static void main(String[] args) throws EncryptedDocumentException, IOException 
  {
	FileInputStream file=new FileInputStream("G:\\Velocity soft testing\\16th_july.xlsx");
	
    
   CellType s1 = WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getCell(0).getCellType();
     System.out.println(s1);
   }
}
