package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriver01 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\datafile1\\Book2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		int row=sheet.getLastRowNum();
		int cell=sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<=row; r++)
		{
			XSSFRow rows=sheet.getRow(r);
			for(int c=0; c<cell; c++)
			{
				XSSFCell cells=rows.getCell(c);
				System.out.print(cells.toString());
			}
			System.out.println();
		}
	}

}

