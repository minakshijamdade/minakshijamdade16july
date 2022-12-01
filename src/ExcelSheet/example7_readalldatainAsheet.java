package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example7_readalldatainAsheet

{
   public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("G:\\Velocity soft testing\\16th_july.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
	
	int lastrowindex=sh.getLastRowNum();
	
	for(int i=0;i<=lastrowindex;i++)    //outer for loop--->row
	{
		
		int lastcolindex=sh.getRow(i).getLastCellNum()-1;
		
		for(int j=0;j<=lastcolindex;j++)   ////inner for loop--->col
		{
			
			String value=sh.getRow(i).getCell(j).getStringCellValue();
			
			
			System.out.print(value+" ");
		}
		
		
		System.out.println();
	}
	
	
	}
}
