package BaseClass;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelPara {
	
	//File src=new File("C:\\Users\\Baburao\\Downloads\\input.xlsx");
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelPara(String excelpath){
		try{
			File src=new File(excelpath);
			
			FileInputStream fis=new FileInputStream(src);
			wb=	new XSSFWorkbook(fis);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
}

public String getData(int SheetNumber,int row,int column){
	sheet1=wb.getSheetAt(SheetNumber);
	String data=sheet1.getRow(row).getCell(column).getStringCellValue();
	return data;
}
}