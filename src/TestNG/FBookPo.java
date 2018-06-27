package TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;
import CommomPoM.FacePom;

public class FBookPo {
	public class Facedata extends BrowserHooks{
		  @Test(dataProvider="oneBrowser")
		  public void Book(String browser,String Version,String os,Method method) throws FileNotFoundException, IOException {
			  this.createDriver(browser, Version, os, method.getName());
			  
			  WebDriver d=this.getWebDriver();
			 
			 d.get("https://www.facebook.com");
			  	
			  FacePom scj=new FacePom(d);
			  
			  //driver.get(ProHandle.fetchKey(Autoconstants.URL.ABC));
			  scj.pass("814258652");
			  scj.text("jkhkjhs");
			  scj.type();
			  
		  }
		}

		}
