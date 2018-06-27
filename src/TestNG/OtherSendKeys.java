package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




public class OtherSendKeys{
  @Test
  public void SendKeys()throws Exception {
	  
	  File file=new File("C:\\Users\\Baburao\\workspace\\Program\\TestData\\Testdata.Pro");
	  FileInputStream fileinput=null;
	  try{
		  fileinput=new FileInputStream(file);
	  }catch(FileNotFoundException e){
		  e.printStackTrace();  
	  }
	  
	  //load properties file
	  Properties prop=new Properties();
	  try{
		  prop.load(fileinput);
	  }catch(IOException e){
		  e.printStackTrace();
	  }
	  
	
	 WebDriver driver=new FirefoxDriver();
	  driver.get(prop.getProperty("Url"));
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("username"));
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  
	  System.out.println("url"+prop.getProperty("Url"));
	  System.out.println("Name"+prop.getProperty("username"));
	  System.out.println("Pass"+prop.getProperty("password")); 
	 
	  
  }
}

