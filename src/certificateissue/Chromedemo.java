package certificateissue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Chromedemo {
	
	@Test
	
	public void certificate(){
		
		DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.cacert.org/");
	
	}
}
