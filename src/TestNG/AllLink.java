package TestNG;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;
import CommomPoM.AllLinksPage;


public class AllLink extends BrowserHooks{
  @Test(dataProvider="hardCodeBrowser")
  public void Links(String browser,String version,String os,Method methode) throws UnexpectedException, MalformedURLException {
	  this.createDriver(browser, version, os, methode.getName());
	  
	  
	  WebDriver driver=this.getWebDriver();
	  
	  AllLinksPage al=new AllLinksPage(driver);
	  
	  
	  driver.get("http://www.seleniumhq.org");
	  
	  al.getAllLinks();
	  
  }
}
