package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateDataExcel {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\DATA\\CREATED.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DATA1");
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("san");
		row.createCell(1).setCellValue("bha");
		row.createCell(2).setCellValue("chan");
		
		XSSFRow row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("kot");
		row1.createCell(1).setCellValue("jya");
		row1.createCell(2).setCellValue("pra");
		
		workbook.write(file);
		

	}

}

