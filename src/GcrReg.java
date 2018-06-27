import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GcrReg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.gcrit.com/build3");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath("//input[@name='gender']")).click();
		driver.findElement(By.name("firstname")).sendKeys("raghu");
		driver.findElement(By.name("lastname")).sendKeys("sandya");
		driver.findElement(By.id("dob")).sendKeys("08/06/1992");
		driver.findElement(By.name("email_address")).sendKeys("giddu4qe@gmail.com");
		driver.findElement(By.name("company")).sendKeys("Amphenol");
		driver.findElement(By.name("street_address")).sendKeys("2233/14A");
		driver.findElement(By.name("postcode")).sendKeys("516001");
		driver.findElement(By.name("city")).sendKeys("yemmiganur");
		driver.findElement(By.name("state")).sendKeys("AP");
		
		// Select Drop Down
		
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("India");
		
		//dropdown.selectByIndex(2);
		
		driver.findElement(By.name("telephone")).sendKeys("1236547890");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8142586250");
	
		driver.findElement(By.xpath("//input[@name='confirmation']")).sendKeys("8142586250");
		
		//Thread.sleep(2500);
		driver.findElement(By.xpath(".//*[@id='tdb4']")).click();
	    
		//driver.findElement(By.xpath("//button[@id='tdb5']")).click();
	//driver.findElement(By.className("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary ui-priority-primary ui-state-hover ui-state-focus")).click();
		
		String conformationmessage=driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
		if(conformationmessage.equals("success")){
			System.out.println("passed");
		}
		else{
			System.out.println("failed");
		}
	
	}

}
