package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TakeScreenShoot {
	WebDriver driver;
  @Test
  public void ScreenShoot() throws InterruptedException, IOException {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.facebook.com/");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raghusandya.raghu@gmail.com");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8142586050");
	  Thread.sleep(5000);
	   File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(f1,new File("C:/Users/Baburao/Desktop.png"));

  }
  }
  
