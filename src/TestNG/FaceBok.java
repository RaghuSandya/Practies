package TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;
import CommomPoM.FaceBookPoM;

public class FaceBok extends BrowserHooks {
  @Test(dataProvider="oneBrowser")
  public void Book(String browser,String Version,String os,Method method) throws FileNotFoundException, IOException {
	  this.createDriver(browser, Version, os, method.getName());
	  
	  WebDriver driver=this.getWebDriver();
	 
	 driver.get("https://www.facebook.com");
	  	
	  FaceBookPoM scj=new FaceBookPoM(driver);
	  
	  //driver.get(ProHandle.fetchKey(Autoconstants.URL.ABC));
	  
	  scj.EmailText("mail@mail.com");
	  scj.Password("5468254256");
	  scj.Login();
	  
  }
}
            