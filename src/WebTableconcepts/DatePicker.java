package WebTableconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DatePicker {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='dphh1']"));
		String date="26/05/2018";
		
		selectDateByJS(driver,element,date);
	} 
	
	public static void selectDateByJS(WebDriver driver,WebElement element,String date){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}

}
