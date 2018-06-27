package Call2MeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Call2meReg {
  @Test
  public void call() {
	  WebDriver driver=new FirefoxDriver();
	  
	  Call2Mepages.Call2Me1PoMReg cm=new Call2Mepages.Call2Me1PoMReg(driver);
	  
	  driver.navigate().to("https://click2callme.pl/");
	  cm.registartion();
	  cm.email("giddu4qe@gmail.com");
	  cm.firstname("siva");
  
  }
}
