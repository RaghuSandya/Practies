import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DDMultipleList {

	public static void main(String[] args) {
		
		//WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\Downloads\\Compressed\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		
		
		Select dropdown=new Select(driver.findElement(By.name("country")));
		
		List<WebElement> e=dropdown.getOptions();
		int itemcount=e.size();
		System.out.println("Total list:"+itemcount);
		
		for(int i=0; i<itemcount;i++){
			System.out.println(e.get(i).getText());
			
		}

	}

}
