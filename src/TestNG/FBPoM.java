package TestNG;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import BaseClass.AllBrows;
//import BaseClass.AllBrows;
//import BaseClass.BaseBowsers;
import CommomPoM.FaceBookP;
//import CommomPoM.FaceBookPoM;

public class FBPoM {
	//WebDriver driver;
//@Parameters("browser")
  @Test
  public void book() {
	  /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\chromedriver.exe");
	  driver=new ChromeDriver()*/;
	 WebDriver driver=new FirefoxDriver();
	  
	  FaceBookP scj=new FaceBookP (driver);
	  driver.get("https://www.facebook.com");
	  	
	 
	  scj.EmailText("raghusandya.raghu@gmail.com");
	  scj.Password("8142586250");
	  scj.Login();
  }
}
