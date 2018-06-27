package CommomPoM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookP {
	
public WebDriver driver;
	
	
	
	By EmailText      = By.xpath("//input[@id='email']");
	
	By PasswordText   = By.xpath("//input[@id='pass']");
	
	By Login          = By.xpath("//input[@type='submit']");
	
	
	public FaceBookP(WebDriver driver){
		this.driver=driver;
	}
	
	public void EmailText(String enterTxt){
		driver.findElement(EmailText).sendKeys(enterTxt);
	}
	public void Password(String enterTxt){
		driver.findElement(PasswordText).sendKeys(enterTxt);
	}
	public void Login(){
		driver.findElement(Login).click();
	}
}



