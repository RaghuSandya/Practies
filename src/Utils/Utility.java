package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void ScreenShoot(WebDriver driver,String ScreenShoot){
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			 File src =ts.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src, new File("./ScreenShoots/"+ScreenShoot+".png"));
		} catch (Exception e) {
			
			System.out.println("Exception while taking Screen Shoot"+e.getMessage());
		}
		
	}

}
