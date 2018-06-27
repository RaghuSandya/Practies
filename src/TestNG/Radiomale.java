package TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;
import CommomPoM.RadioButton;



public class Radiomale extends BrowserHooks {
  @Test(dataProvider="oneBrowser")
  public void Rmale(String browser,String version,String os,Method method) throws FileNotFoundException, IOException {
	  
	this.createDriver(browser, version, os, method.getName());
	
	  WebDriver driver=this.getWebDriver();
	  
	  RadioButton rg= new RadioButton(driver);
	  
	  driver.get("https://www.facebook.com/");
	  //driver.get(ProHandle.fetchKey(Autoconstants.URL.ABC));
	  rg.RB();
	  
  }
}
