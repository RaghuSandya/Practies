package TestNG;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;

public class MultiplePopUps extends BrowserHooks{
	 @Test(dataProvider="oneBrowser")
	  public void Alert(String browser,String version,String os,Method method) throws UnexpectedException, MalformedURLException {
		  this.createDriver(browser, version, os, method.getName());
		  WebDriver driver=this.getWebDriver();
		  
		 
		  driver.get("https://www.naukri.com/");
		  
		  String page=driver.getTitle();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Set<String>allWhs=driver.getWindowHandles();
		  
		  //more window Alerts
		  
		  for(String gc:allWhs){
			  driver.switchTo().window(gc);
			  String title=driver.getTitle();
			  if(page.equals(title)){
				  System.out.println("main Browser is"+page);
			  }
			  else{
				  System.out.println(title+ "Child browsers");
				  driver.close();
			  }
		  }	  
	  }
	}
