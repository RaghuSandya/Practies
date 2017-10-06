import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriLogin {

	//private static final CharSequence Key = null;

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://login.naukri.com");
		driver.findElement(By.xpath("//input[@id='emailTxt']")).sendKeys("giddu4qe@gmail.com");
		driver.findElement(By.xpath("//input[@id='pwd1']")).sendKeys("8142586250");
		
		driver.findElement(By.xpath("//input[@id='sbtLog' and @name='Login']")).click();
		
		driver.findElement(By.xpath("//a[@href='//my.naukri.com/Profile/view?id=']")).click();
		driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\Baburao\\Downloads\\giddu.EE.doc");
		
		/*String mainPage =driver.getWindowHandle();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		alt.dismiss();*/
		

	
		/*String conformationmessage=driver.findElement(By.xpath("//i[@id='attachCVMsg']")).getText();
		if(conformationmessage.equals("File uploaded successfully."))
		{
			System.out.println("passed....");
		}
		else
		{
			System.out.println("Failed....");
		}*/
		//driver.findElement(By.xpath("//div[@class='mTxt']")).click();
		//driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		driver.findElement(By.xpath("//button[@class='w85bt fl']")).click();
		//driver.close();
		
		
		
	}
}

