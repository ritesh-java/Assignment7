package packageone;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelStudent{
	
	
	public static void main(String args[]) throws IOException{
		
		String file = "C:/Users/Ritesh Puri/Desktop/testexcel1.xls";
		FileOutputStream fos = new FileOutputStream(file);
        HSSFWorkbook book = new HSSFWorkbook();
        HSSFSheet sheet = book.createSheet("Student Information");
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students in a class");
		int total = scan.nextInt();
		
		
        HSSFRow rows = sheet.createRow(0);
        rows.createCell(0).setCellValue("Student ID");
        rows.createCell(1).setCellValue("Student Name");
        rows.createCell(2).setCellValue("Student Marks");
        rows.createCell(3).setCellValue("Maximum Marks");
        rows.createCell(4).setCellValue("Student Fees");
        
        for(int i =0;i<total;i++){
        	HSSFRow rownew = sheet.createRow(i+1);
        	
        	System.out.println("Enter the student ID");
			rownew.createCell(0).setCellValue(scan.nextInt());		
			System.out.println("Enter the student name");
			rownew.createCell(1).setCellValue(br.readLine());
			System.out.println("Enter the total marks scored out of 500");
			rownew.createCell(2).setCellValue(scan.nextInt());
			rownew.createCell(3).setCellValue(500);
			System.out.println("Enter the student fees");
			rownew.createCell(4).setCellValue(scan.nextInt());
			
        }

               
        book.write(fos);
        fos.flush();
        fos.close();
        book.close();
        scan.close();
        
	}
}


/* Result enclosed in the excel file on entering the following data
Enter the number of students in a class
4
Enter the student ID
1
Enter the student name
Ravi Kumar
Enter the total marks scored out of 500
489
Enter the student fees
56453
Enter the student ID
2
Enter the student name
Mukesh Ambani
Enter the total marks scored out of 500
456
Enter the student fees
76564
Enter the student ID
3
Enter the student name
Shekhar Aggarwal
Enter the total marks scored out of 500
498
Enter the student fees
53467
Enter the student ID
4
Enter the student name
Shreya Singhal
Enter the total marks scored out of 500
492
Enter the student fees
54356
*/