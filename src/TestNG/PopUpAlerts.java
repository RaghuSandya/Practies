package TestNG;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;

public class PopUpAlerts extends BrowserHooks{
  @Test(dataProvider="oneBrowser")
  public void Alert(String browser,String version,String os,Method method) throws UnexpectedException, MalformedURLException {
	  this.createDriver(browser, version, os, method.getName());
	  WebDriver driver=this.getWebDriver();
	  
	  driver.get("https://www.irctc.co.in");
	  
	
	  String page=driver.getTitle();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  
	Alert alert=driver.switchTo().alert();
	 alert.accept();
	 System.out.println("Display:"+page);
	  
  }
}
