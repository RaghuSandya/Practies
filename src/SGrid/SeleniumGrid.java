package SGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	 
		@Test
		public void Grid() throws MalformedURLException{
		
			DesiredCapabilities cap=DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
			
			URL url=new URL("http://localhost:4444/wd/hub");
			
			  WebDriver driver=new RemoteWebDriver(url, cap);
			
			driver.get("http://www.seleniumhq.org/");
			System.out.println("Title is"+driver.getTitle());
			driver.quit();
			
		}

	}


