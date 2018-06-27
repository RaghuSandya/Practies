package TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class ScreenShot {
  @Test
  public void ScreenShot() {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.facebook.com");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raghusandya.raghu@gmail.com");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8142586050");
	  
	  
  }
}
