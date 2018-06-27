package ToolTip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTips {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver =new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//Open Gmail account 
		
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		
		//click on username textbox
		
		driver.findElement(By.xpath("//input[@id='GmailAddress']")).click();
		
		//Create Action Class
		
		Actions builder=new Actions(driver);
		
		//find the tooltip xpath
		
		WebElement tooltips=driver.findElement(By.xpath("//div[@class='jfk-bubble']"));
		
		//mouse over on the text message
		
		builder.moveToElement(tooltips).perform();
		
		//tooltip msg Ectarct
		
		String tip_msg=tooltips.getText();
		
		//Print the tooltips msg
		System.out.println("Tooltip mag is:"+tip_msg);
		
	}

}
