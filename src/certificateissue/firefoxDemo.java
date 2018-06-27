package certificateissue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class firefoxDemo {
	
	@Test
	
	public void certificate(){
		
		
		DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver=new FirefoxDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.cacert.org/");
	
	}
}
