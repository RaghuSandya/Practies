package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	 static WebDriver driver;
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Baburao/workspace/SamplePrograms/Libs/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://wpengine.com/");
		
		WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Pricing')]"));
		Actions act= new Actions(driver);
		act.click(e);
	}

}
