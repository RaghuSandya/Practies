package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class MouseOver {
  @Test
  public void Action() {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("http://www.gcrit.com/build3/");
	  
	  Actions act=new Actions(driver);
	  WebElement hrLink=driver.findElement(By.linkText("create an account"));
	  act.moveToElement(hrLink).perform();
	  System.out.println("Action Completed...");
	  act.moveToElement(hrLink).contextClick().perform();
  }
}
