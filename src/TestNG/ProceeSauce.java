package TestNG;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;

public class ProceeSauce extends BrowserHooks{
  @Test(dataProvider="hardCodedBrowsers")
  public void facebook( String Browser,String os,String version,Method method) throws UnexpectedException, MalformedURLException {
	  this.createDriver(Browser, version, os, method.getName());
	  WebDriver driver=this.getWebDriver();
	  
	  //open url
	  driver.get("https://www.facebook.com");
	  
	 // ProceeSauce fb=new ProceeSauce();
	  
  }
}
