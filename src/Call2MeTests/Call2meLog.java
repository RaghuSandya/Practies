package Call2MeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import BaseClass.BaseBowsers;


public class Call2meLog {
	public static WebDriver driver;
  @Test
  public void Log() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.get("https://app.click2callme.pl/admin/dashboard/");
	  
	  Call2Mepages.call2me2POMLog log=new Call2Mepages.call2me2POMLog(driver);
	  
	  log.login("jbgiddaiah@gmail.com");
	  log.Passwd("8142586250");
	  log.submit();
	  
	
  }
}
