package ScrollDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class ScrollForElement {

	@Test
	public void ScrollBar(){
		 WebDriver driver;
		 driver=new FirefoxDriver();
		 
		 driver.get("http://manos.malihu.gr/jquery-custom-content-scroller/");
		 
		 
		 //Create java Script Executor
		 JavascriptExecutor je=(JavascriptExecutor)driver;
		 
		 //Identify the element After Scroll Down
		
		 WebElement element=driver.findElement(By.xpath(".//*[@id='main']/div/article/div[2]/ul[1]/li[5]/a"));
		 
		 //Now Execute the Actual query will scroll until that element is not appear
		 je.executeScript("argument[0].scrollIntoView(true);", element);
		 
		 //Exactly text
		 System.out.println(element.getText());
	}
}
