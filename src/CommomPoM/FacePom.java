package CommomPoM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacePom {
public WebDriver d;
By EmailText = By.xpath("//input[@id ='email']");
By pass = By.xpath("//input[@id ='pass']");
By type = By.xpath("//input[@type ='submit']");
//public FacePom(WebDriver d2) {
	// TODO Auto-generated constructor stub

public FacePom(WebDriver d){
	this.d = d;
}
public void text(String entertxt){
	d.findElement(EmailText).sendKeys(entertxt);
}
public void pass(String entertxt){
	d.findElement(pass).sendKeys(entertxt);
}
public void type(){
	d.findElement(type).click();
}
}
