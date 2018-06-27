package CommomPoM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
	
	public static WebDriver driver;
	
	
	By Radio		=By.xpath("//input[@id='u_0_8']");
	
	public RadioButton(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void RB(){
		driver.findElement(Radio).click();
	}

}
