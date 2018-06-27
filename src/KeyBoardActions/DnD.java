package KeyBoardActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DnD {
		public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\workspace\\SamplePrograms\\Libs\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	//dynamic wait
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.switchTo().frame(0);
	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']/p")))
	.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		
  }
}
