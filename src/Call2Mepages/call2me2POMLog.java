package Call2Mepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class call2me2POMLog {
	public WebDriver driver;
	
	By Email = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@id='submit']");
	
	By dropdown = By.xpath("//div[@class='dashboard_presence_status']");
	//By PresentState =By.xpath("//span[@class='presence_status_label']");
	
	public call2me2POMLog(WebDriver driver){
		this.driver=driver;
	}
	public void login(String entertxt){
		driver.findElement(Email).sendKeys(entertxt);
	}
	public void Passwd(String txt){
		driver.findElement(password).sendKeys(txt);
	}
	public void submit(){
		driver.findElement(login).click();
	}
	/*public void Present(){
		Select Dropdown=new Select(driver.findElement(dropdown));
		Dropdown.selectByVisibleText("Active");
	}
	public void Present1(){
		Select down=new Select(driver.findElement(dropdown));
		down.selectByVisibleText("Busy");
	}
	public void presentState2(){
		Select dwn=new Select(driver.findElement(dropdown));
		dwn.selectByVisibleText("Inaccessible");
	}*/

////span[@class='glyphicon glyphicon-chevron-down]

	/*Actions keyDown = new Actions(driver);
	keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();*/
}

