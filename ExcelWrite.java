package packageone;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelWrite{
	
	public static void main(String args[]) throws IOException{
		String file = "C:/Users/Ritesh Puri/Desktop/testexcel.xls";
		FileOutputStream fos = new FileOutputStream(file);
        HSSFWorkbook book = new HSSFWorkbook();
        HSSFSheet sheet = book.createSheet("Week names");
        
        HSSFRow rows = sheet.createRow(0);
        rows.createCell(0).setCellValue("Weeks");
        
        HSSFRow row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Sunday");
        
        HSSFRow row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("Monday");
        
        HSSFRow row3 = sheet.createRow(3);
        row3.createCell(0).setCellValue("Tuesday");
        
        HSSFRow row4 = sheet.createRow(4);
        row4.createCell(0).setCellValue("Wednesday");
        
        HSSFRow row5 = sheet.createRow(5);
        row5.createCell(0).setCellValue("Thursday");
        
        HSSFRow row6 = sheet.createRow(6);
        row6.createCell(0).setCellValue("Friday");
        
        HSSFRow row7 = sheet.createRow(7);
        row7.createCell(0).setCellValue("Saturday");

        
        book.write(fos); 
        fos.flush();
        fos.close();
        
	}
}
