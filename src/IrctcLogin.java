import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IrctcLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.get("https://www.irctc.co.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("giddaiah7");
		driver.findElement(By.xpath("//input[@class='loginPassword']")).sendKeys("gcw210");
		
		//while entering a CAPTCHA create a scanner object
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter captcha");
		String captcha=sc.nextLine();
		
		driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// Entering train details
		
		driver.findElement(By.xpath("//input[@id='jpform:fromStation']")).sendKeys("TIRUPATI - TPTY");
		driver.findElement(By.id("jpform:toStation")).sendKeys("GUNTAKAL JN - GTL");
		
		driver.findElement(By.className("hasDatepicker")).sendKeys("25-09-2017");
		driver.findElement(By.xpath("//input[@id='jpform:jpsubmit']")).click();
		
		/*driver.findElement(By.className("ui-datepicker-trigger")).click();
	    driver.findElement(By.className("ui-state-default ui-state-hover")).click();*/
		
	String conformation=driver.findElement(By.className("logheading")).getText();
	if(conformation.equals("train between stations")){
	System.out.println("success");
	}
	else{
		System.out.println("Failed");
	
	}
	driver.findElement(By.xpath(".//*[@id='topnav']/li[8]/ul/li[5]/a/span")).click();
	}

}
