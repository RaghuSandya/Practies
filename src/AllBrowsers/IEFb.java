package AllBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEFb {
	public static void main(String[] args) {
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*Alert ac=driver.switchTo().alert();
		ac.accept();*/
		//driver.navigate().to("https://www.google.com/?gws_rd=ssl");;
		driver.get("https://www.youtube.com");
		
	}

}
