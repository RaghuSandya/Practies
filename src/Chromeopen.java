import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chromeopen {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();*/
		/*
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\IEDriverServer.exe");
		WebDriver ie=new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();*/

		//System.setProperty("webdriver.ie.driver", "C:\\Users\\Baburao\\workspace\\Program\\libs\\IEDriverServer.exe");
		WebDriver driver1=new FirefoxDriver();
		//driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://www.youtube.com");
		driver1.manage().window().maximize();
		System.out.println(driver1.getTitle());
		driver1.quit();

	}

}
