package TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.BrowserHooks;
import CommomPoM.HomePageSel;

public class DrapDrop extends BrowserHooks {
		
			 @Test(dataProvider="oneBrowsers")
			  public void dragNdrop(String browser,String version,String os, Method method) throws FileNotFoundException, IOException, InterruptedException {
				  this.createDriver(browser, version, os, method.getName());
				  WebDriver driver = this.getWebDriver();
				  
				  HomePageSel objHome= new HomePageSel(driver);
				  
				  //Open golf site URL as below
				  driver.get("http://www.americangolf.co.uk/golf-clubs/drivers?pmax=275&pmin=25");
				  
				  //Handle drag and drop function built in page
				 // objHome.d
	
}
}

/*public void dragnDropSlider() throws InterruptedException{
	Thread.sleep(5000);
	driver.findElement(DragDropPgCloser).click();
	Actions actions =  new Actions(driver);
	actions.dragAndDropBy((WebElement) DragSlider, 34,-82).build().perform();
    */
