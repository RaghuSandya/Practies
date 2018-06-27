package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.Helperlass;

public class HelperClass {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		Helperlass.main(driver, username);
		username.sendKeys("raghusandya.raghu@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		Helperlass.main(driver, pass);
		pass.sendKeys("8142586250");
		
	}

}
 