package TestNG;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;

//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.AfterTest;

public class Browsers {
  @Test(priority=3)
  public void you() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
  }
  @Test(priority=1)
  public void yo2() {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
  }
  @Test(priority=2)
  public void you3() {
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
  }
  /*@BeforeTest
  public void beforeTest() {
	  System.out.println("open all browsers..");
	  
  }*/

  /*@AfterTest
  public void afterTest() {
	  System.out.println("close the browsers...");

  }*/
  }
