package WebTableconcepts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DatePickerDemo {
	public static void main(String[] args) throws InterruptedException {
		
	    DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.mercurytravels.co.in/");
		 
		 driver.findElement(By.xpath("//input[@id='dphh1']")).click();
		 Thread.sleep(3000);
		 
		 // It will store all web elements in the List 
		 
		 List<WebElement> dates=driver.findElements(By.xpath("//div[@class='datepicker dropdown-menu']//td"));
		
		 int total=dates.size();
		 System.out.println("Toatl dates:"+total);
		 
		 for(int i=0;i<total;i++){
			 
			 String date=dates.get(i).getText();
			 
			// System.out.println("All the dates: "+date);
			 
		    	 if(date.equals("13")){
				 dates.get(i).click();
				 break;
			 }
		 }
	}

 }
