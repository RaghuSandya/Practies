package KeyBoardActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baburao\\workspace\\SamplePrograms\\Libs\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Libs\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://www.americangolf.co.uk/golf-clubs/drivers?pmax=275&pmin=25");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//From
		WebElement From=driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']"));
		
		
		//To
		WebElement To=driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(From, To).perform();
		
		
		
	}

}
