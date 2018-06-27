package TestNG;

import org.testng.annotations.Test;

import BaseClass.ExcelPara;



public class ExelDataRead{
  @Test
  public void DataExcel() {
	  
	  ExcelPara cs=new ExcelPara("C:\\Users\\Baburao\\Downloads\\input.xlsx"); 
	  System.out.println(cs.getData(0, 1, 0));
	  
	
  }
}
