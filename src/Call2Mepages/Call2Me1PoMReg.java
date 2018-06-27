package Call2Mepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Call2Me1PoMReg {
	
	public WebDriver driver;
	
	By Registration	= By.xpath("//a[@href='https://app.click2callme.pl/auth/register']");
	By Email 		= By.xpath("//input[@id='email']");
	By FirstName	= By.xpath("//input[@id='first_name']");
	By  Password 	= By.xpath("//input[@id='password']");
	By ConformPass	= By.xpath("//input[@id='password2']");
	By Organisation	= By.xpath("//input[@id='organization']");
	By submit		= By.xpath("//input[@id='submit']");
	
	
	public Call2Me1PoMReg(WebDriver driver){
		this.driver=driver;
	}
  public void registartion(){
	  driver.findElement(Registration).click();
  }
  public void email(String entertxt){
	  driver.findElement(Email).sendKeys(entertxt); 
  }
  public void firstname(String EnterTxt){
	  driver.findElement(FirstName).sendKeys(EnterTxt);
  }
  public void password(String Tex){
	  driver.findElement(Password).sendKeys(Tex);
  }
  public void conformpass(String Txt){
	  driver.findElement(ConformPass).sendKeys(Txt);
  }
  public void organisation(String EnterTxt){
	  driver.findElement(Organisation).sendKeys(EnterTxt);
  }
  public void Submit(){
	  driver.findElement(submit).click();
  }
}