package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream File=new FileInputStream(System.getProperty("user.dir")+"\\DATA\\DATA03.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(File);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		int lastcell=sheet.getRow(1).getLastCellNum();
		
        System.out.println(row);
		System.out.println(lastcell);
		
		for(int r=0; r<=row; r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0; c<lastcell; c++)
			{
			   XSSFCell currentcell=currentrow.getCell(c);
			   System.out.print(currentcell.toString());
				
			}
			System.out.println();
		}
	}

}
