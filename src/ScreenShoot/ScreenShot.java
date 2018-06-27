package ScreenShoot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utils.Utility;



public class ScreenShot {
	
	public  WebDriver driver;
	@Test
	public void FbScreenShoot() throws Exception {
	
		 driver=new FirefoxDriver();
		 
		
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		
		 
		 driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("ganauab");
		 Utility.ScreenShoot(driver, "Text Box mail"); 
		 
	/*	 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src =ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("./ScreenShoots/FbScreenShoot.png"));*/
		
	
	}
	@AfterMethod
	
	public void teardown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			Utility.ScreenShoot(driver, result.getName());
		}
		
		driver.quit();
	}

}
