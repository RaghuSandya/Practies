package TestNG;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.amazon.in/");
	Actions a=new Actions(driver);
	WebElement e=driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
	a.moveToElement(e).perform();
	
	/*List<WebElement> l = driver.findElements(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li/a"));
    for(WebElement ele : l )
    {
        String orl = "Evening Dresses";
        String expt = ele.getText();
        if(orl.equalsIgnoreCase(expt)){
            {
                ele.click();
                break;
	
	}
}
    }*/
	}
}