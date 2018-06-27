package TestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ChildPopUp {
  @Test
  public void ChildPop() {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.navigate().to("https://www.yatra.com/");
	  
	  driver.findElement(By.xpath("//a[@id='signInBtn']")).click();
	  
	/*  Set<String>set1=driver.getWindowHandles();
	  Iterator<String>win1=set1.iterator();
	  String parent=win1.next();
	  String child=win1.next();
	  driver.switchTo().window("child");*/
	  
	  driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("sravank53@gmail.com");
	  driver.findElement(By.xpath("//button[@id='login-continue-btn']")).click();
	  driver.findElement(By.xpath(".//*[@id='login-error']/a")).click();
	  
	  //driver.switchTo().window("parent");
	  //driver.findElement(By.xpath("//a[@id='SignUpBtn']")).click();.
	  driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("8985063490");
	  driver.findElement(By.xpath("//input[@id='signup-password']")).sendKeys("8985063490");
	  
	  Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='signup-user-designation']")));
	  dropdown.selectByVisibleText("Mr.");
  }
}
