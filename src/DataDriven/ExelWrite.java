package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExelWrite {
	WebDriver driver;
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFCell cell;
	
@BeforeTest
	public void Browser(){
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
 @Test
  public void Fb() throws IOException {
	  File fis=new File("C:\\Users\\Baburao\\Downloads\\input.xlsx");
	  FileInputStream fi=new FileInputStream(fis);
	  book=new XSSFWorkbook(fi);
	  sheet=book.getSheetAt(0);
	  
	  for(int i=0;i<=sheet.getLastRowNum();i++){
		  cell=sheet.getRow(i).getCell(0);
		  cell.setCellType(Cell.CELL_TYPE_STRING);
		  
		  driver.findElement(By.xpath("//input[@id ='email']")).clear();
		  driver.findElement(By.xpath("//input[@id ='email']")).sendKeys(cell.getStringCellValue());
		  
		  cell=sheet.getRow(i).getCell(1);
		  driver.findElement(By.xpath("//input[@id ='pass']")).clear();
		  driver.findElement(By.xpath("//input[@id ='pass']")).sendKeys(cell.getStringCellValue());
		  
		  driver.findElement(By.xpath("//input[@type ='submit']")).click();
		  
		  //writing
		  
		  FileOutputStream fos=new FileOutputStream(fis);
		  
		  String message ="Fail";
		  
		  sheet.getRow(i).createCell(2).setCellValue(message);
		  
		book.write(fos);
		fos.close();
	  }
  }
}
