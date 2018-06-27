package IframeDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IFrames {
	@Test
	public void farmes(){
	WebDriver driver=new FirefoxDriver();
	
	
	driver.get("http://demo.guru99.com/selenium/guru99home/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	int size=driver.findElements(By.tagName("iframe")).size();
	System.out.println("Ttal no of frames: "+size);
	
	
	/*for(int i=0;i<=size;i++){
		driver.switchTo().frame(i);
		Dimension total=driver.findElement(By.xpath("html/body/a/img")).getSize();
		driver.switchTo().defaultContent();
	}
	*/
	
	driver.switchTo().frame("a077aa5e");
	
	driver.findElement(By.xpath("html/body/a/img")).click();
	
	//System.out.println("title name is :"+title);
	/*
	driver.findElement(By.xpath("/http://demoqa.com/registration/")).click();
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Giddaiah");
	
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("")).click();*/
	
	}
}
