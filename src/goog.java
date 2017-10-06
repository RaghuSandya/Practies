import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;
import Utils.Autoconstants;
import Utils.HomePageSel;
import Utils.ProHandle;


public class goog extends BrowserHooks{

	@Test(dataProvider="hardCodedBrowsers")
	  public void openSeleniumRaghu(String browser,String version,String os, Method method)throws FileNotFoundException, IOException {
		  this.createDriver(browser, version, os, method.getName());
		  WebDriver driver = this.getWebDriver();
		 
		  driver.get("http://www.seleniumhq.org");
//Page obj for selenum home page
		 
		  HomePageSel objSel = new HomePageSel(driver);
		  
		  
		  //Opening the selenium homepage URL
		  
		  driver.get(ProHandle.fetchKey(Autoconstants.URL.URL));
		  
		  //Type Bahuabali in the search selenium text box and click GO
		  
		  objSel.searchSelenium("Giddaiah");
		 
	  }

}
