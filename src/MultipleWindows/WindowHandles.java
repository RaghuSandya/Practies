package MultipleWindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {
		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\workspace\\SamplePrograms\\Libs\\chromedriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.popuptest.com/goodpopups.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Good PopUp #1")).click();
			/*driver.findElement(By.linkText("Good PopUp #2")).click();
			driver.findElement(By.linkText("Good PopUp #3")).click();
			driver.findElement(By.linkText("Good PopUp #4")).click();*/
			
			
			Set<String>st=driver.getWindowHandles();
			Iterator<String>it=st.iterator();
			String Parentpage=it.next();
			
			String childpage1=it.next();
			driver.switchTo().window(childpage1);
			System.out.println("childPage:"+childpage1);
			System.out.println("childPage 1:"+driver.getTitle());
			
			
		}

	}
