package AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadAutoIT {
  @Test
  public void FileUpload() throws IOException {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://demo.guru99.com/selenium/upload/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@id='uploadfile_0']")).click();
	  
	  //File upload Using AutoIT
	  
	  Runtime.getRuntime().exec("E:\\AutoIt\\FileUpload.exe");
  }
}
