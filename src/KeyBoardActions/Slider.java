package KeyBoardActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Libs\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("http://jqueryui.com/slider/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement frame=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
	driver.switchTo().frame(frame);
	
	//Slide Bar
	
	WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
	int sliderwidth=slider.getSize().width;
		
	WebElement sliderbar=driver.findElement(By.xpath("//div[@id='slider']>a"));
	
	Actions act=new Actions(driver);
	
	act.clickAndHold(slider);
	act.moveByOffset(40, 0).build().perform();
	
	}

}
