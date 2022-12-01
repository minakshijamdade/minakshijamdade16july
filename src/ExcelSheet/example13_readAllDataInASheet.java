package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example13_readAllDataInASheet 

{
public static void main(String[] args) throws EncryptedDocumentException, IOException 

{
	FileInputStream file=new FileInputStream("G:\\Velocity soft testing\\16th_july.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
	
	int lastrowindex = sh.getLastRowNum();
	
	for(int i=0;i<=lastrowindex;i++)    //for rows
	{
		
		int lastcellindex = sh.getRow(i).getLastCellNum()-1;
		
		for(int j=0;j<=lastcellindex;i++)   //for cols
		{
			Cell cellinfo = sh.getRow(i).getCell(0);
			
			CellType s1 = cellinfo.getCellType();
			
			if(s1==CellType.STRING)
			{
				
				String value = cellinfo.getStringCellValue();
				
				System.out.println(value+" ");
			}
			
			else if(s1==CellType.NUMERIC)
			{
				
				double value = cellinfo.getNumericCellValue();
				
				System.out.println(value+" ");
			}
			
			else if(s1==CellType.BOOLEAN)
			{
				
				boolean value = cellinfo.getBooleanCellValue();
				
				System.out.println(value+" ");
			}
			
			
		}
	}
	
}
}
