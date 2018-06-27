package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {
	public static void main(String[] args) {
		 WebDriver driver;
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.co.in/");
		 
   		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println("Total links are"+list.size());
		
		for(int i=0;i<=list.size();i++){
			WebElement ele=list.get(i);
			String url=ele.getAttribute("href");
		verifyLinkActive(url);
			
		}
	}


	private static void verifyLinkActive(String url) {
		
	try{
		URL Ur=new URL(url);
		HttpURLConnection httpURLConnection=(HttpURLConnection)Ur.openConnection();
		httpURLConnection.setConnectTimeout(3000);
		httpURLConnection.connect();
		
		if(httpURLConnection.getResponseCode()==200){
			System.out.println("link url" +httpURLConnection.getResponseMessage());
		}
		if(httpURLConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
			System.out.println("LinkUrl"+ httpURLConnection.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
		}
	}catch(Exception e){
		
	}
		
	}
}
