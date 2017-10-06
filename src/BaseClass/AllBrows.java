package BaseClass;

import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class AllBrows {
 public static WebDriver driver;
 @Parameters("browser")
  @BeforeTest
  public void Open(String browser) {
	 if(browser.equals("Fire fox")){
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\geckodriver.exe");
		  driver=new FirefoxDriver();
	 }
	 if(browser.equals("Chrome")){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\chromedriver.exe");
		  driver=new ChromeDriver();
	 }
	 if(browser.equals("IE")){
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
	 }
  }

  @AfterTest
  public void close() {
	  driver.quit();
  }

}
