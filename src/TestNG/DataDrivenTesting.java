package TestNG;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import jxl.Cell;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class DataDrivenTesting extends DataProvi {
	WebDriver driver;
  @Test(dataProvider="input")
  public void facebook(){
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  driver.findElement(By.xpath("//input[@id='email']"));
	  driver.findElement(By.xpath("//input[@id='pass']"));
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
  }

/*@DataProvider(name="input")
public Object[][] readExcel() throws BiffException, IOException {


		File fis=new File("C:\\Users\\Baburao\\Downloads\\input.xlsx");
		Workbook wb=Workbook.getWorkbook(fis);
	Sheet s=wb.getSheet(1);
	int rows=s.getRows();
	int colunms=s.getColumns();
	
	String inputData[][]=new String[rows][colunms];
	for(int i=0;i<=rows;i++){
		for(int j=0;j<=colunms;j++){
			Cell c=s.getCell(i,j);
			inputData[i][j]=c.getContents();
			System.out.println(inputData[i][j]);
		}
	}
	return inputData;
		
}		*/
}