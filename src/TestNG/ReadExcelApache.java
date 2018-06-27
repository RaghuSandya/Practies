package TestNG;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelApache {
  @Test
  public void facebookdata() throws IOException   {
	  //File location
	  File src=new File("C:\\Users\\Baburao\\Downloads\\input.xlsx");
	
	  //Input Streams
	  
	  FileInputStream fis=new FileInputStream(src);
	 
	  //creating work book obj for reading each sheet
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	 
	  //getting sheet No.
	  
	  XSSFSheet sheet1=wb.getSheetAt(0);
	 
	  //getting Row value
	  String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	  System.out.println("Excel value:"+data0);
	  
	  String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	  System.out.println("Excel value is:"+data1);
	  wb.close();
  }
}
