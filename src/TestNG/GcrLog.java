package TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;
import CommomPoM.GcrPoM;
import Utils.Autoconstants;
import Utils.ProHandle;

public class GcrLog extends BrowserHooks{
  @Test(dataProvider="oneBrowser")
  public void GCR(String browser,String version,String os,Method method) throws FileNotFoundException, IOException, InterruptedException {
	  this.createDriver(browser, version, os, method.getName());
	  
	  WebDriver driver=this.getWebDriver();
	  
	  GcrPoM gc=new GcrPoM(driver);
	  
	  //url declaration
	  
	driver.get("http://www.gcrit.com/build3/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	  
	  //driver.get(ProHandle.fetchKey(Autoconstants.URL.UrK));
	
	
	 
	 /*Select dropdown=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dropdown.selectByVisibleText("India");
	*/
	  gc.link();
	  gc.radio();
	  gc.Fname("Sandya");
	  gc.Lname("Valkur");
	  gc.DoB("01/10/1992");
	  gc.Email("giddu4qe@gmail.com");
	  gc.Street("Weavers colony");
	  gc.post("518360");
	  gc.city("Yemmiganur");
	  gc.state("AP");
	  gc.country();
	  gc.telephone("9030708025");
	  gc.news();
	  gc.Password("RaghuSandya");
	  gc.conformpass("RaghuSandya");
	  gc.Submit();
	  gc.getallLinks();
	  
	  
  }
}
