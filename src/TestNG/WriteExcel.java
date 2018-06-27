package TestNG;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
  @Test
  public void facebookdata() throws Exception  {
	  //File location
	  File src=new File("C:\\Users\\Baburao\\Downloads\\input.xlsx");
	
	  //Store the location
	  FileInputStream fis=new FileInputStream(src);
	 
	  //creating work book object
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	 
	  //getting sheet No.
	  XSSFSheet sheet1=wb.getSheetAt(0);
	 
	  //Writing values
	  sheet1.getRow(0).createCell(2).setCellValue("Pass");
	  sheet1.getRow(1).createCell(2).setCellValue("Pass");
	  sheet1.getRow(2).createCell(2).setCellValue(14.3256);
	  sheet1.getRow(3).createCell(2).setCellValue(26.5369);
	  
	  FileOutputStream fout=new FileOutputStream(src);
	  
	  wb.write(fout);
	  wb.close();
  }
}
