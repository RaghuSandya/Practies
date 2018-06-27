package BaseClass;

//import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class BaseBowsers {
	public static WebDriver driver;
  
public static String browser="Firefox";
	
  @Parameters("browser")
  
	@BeforeClass
  public void open(String browser)  {
	  //Thread.sleep(5000);
	  if(browser.equals("Firefox")){
		  //System.out.println("firefox Open...");
		  System.setProperty("webdriver.geocko.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  else if(browser.equals("Chrome")){
		 // System.out.println("chrome Open...");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  else if(browser.equals("IE")){
	 // System.out.println("IE Open...");
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();
  }
  else{
	  System.out.println("browser not open...");
	  }
  }
  
  @AfterClass
  public void Logout() {
	 System.out.println("close the browser...");
	  driver.quit();
  }

}
