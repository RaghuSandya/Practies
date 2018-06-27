package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HiddenDivisionPopUp {
  @Test
  public void calenderDivisionPop() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.makemytrip.com/");
	  
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//input[@mt-id='departDate']")).click();
	 /* Alert alert=driver.switchTo().alert();
	  alert.accept();
	  */
	  //driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-hover']")).click();
	
	  driver.findElement(By.xpath("//input[@id='hp-widget__return']")).click();
	  
	  driver.findElement(By.xpath("//a[@href='#']")).click();
  }
}
