package Log4jDemo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Log4 {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("Log4");
		
		PropertyConfigurator.configure("Log4j.properties");
		
		driver =new FirefoxDriver();
		logger.info("firefox open...");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//Open Gmail account 
		
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		logger.info("Link given to the browser..");
		//click on username textbox
		
		driver.findElement(By.xpath("//input[@id='GmailAddress']")).click();
		
		//Create Action Class
		
		Actions builder=new Actions(driver);
		logger.info("Action class Started...");
		
		//find the tooltip xpath
		
		WebElement tooltips=driver.findElement(By.xpath("//div[@class='jfk-bubble']"));
		
		//mouse over on the text message
		
		builder.moveToElement(tooltips).perform();
		
		//tooltip msg Ectarct
		
		String tip_msg=tooltips.getText();
		logger.info("tool tip captured...");
		
		//Print the tooltips msg
		System.out.println("Tooltip mag is:"+tip_msg);
	}

}
