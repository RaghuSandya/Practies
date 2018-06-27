package CommomPoM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import 	java.util.List;
public class GcrPoM {
	public static WebDriver driver;
	
	
	By CreateAccount 	= By.linkText("create an account");
	By clickRadioF		= By.xpath("//input[@value='f']");
	By FirstName		= By.xpath("//input[@name='firstname']");
	By LastName			= By.xpath("//input[@name='lastname']");
	By EnterDob			= By.xpath("//input[@id='dob']");
	By Email 			= By.xpath("//input[@name='email_address']");
	By StreetAdd		= By.xpath("//input[@name='street_address']");
	By Postcode			= By.xpath("//input[@name='postcode']");
	By city				= By.xpath("//input[@name='city']");
	By State			= By.xpath("//input[@name='state']");
	By Country			= By.xpath("//select[@name='country']");
	By Telephone		= By.xpath("//input[@name='telephone']");
	By NewsSletter		= By.xpath("//input[@name='newsletter']");
	By Password			= By.xpath("//input[@name='password']");
	By conformPassWord	= By.xpath("//input[@name='confirmation']");
	By Continue			= By.xpath("//button[@type='submit']");
	By AllLinks			= By.tagName("a");
	
	
	public GcrPoM(WebDriver driver){
		this.driver=driver;
	}
	public void link(){
	driver.findElement(CreateAccount).click();
	}
	public void radio(){
	driver.findElement(clickRadioF).click();
	}
	public void Fname(String enterTxt){
	driver.findElement(FirstName).sendKeys(enterTxt);
	}
	public void Lname(String entertxt){
	driver.findElement(LastName).sendKeys(entertxt);
	}
	public void DoB(String enterTxt){
	driver.findElement(EnterDob).sendKeys(enterTxt);
	}
	public void Email(String enterTxt){
		driver.findElement(Email).sendKeys(enterTxt);
	}
	public void Street(String entertxt){
		driver.findElement(StreetAdd).sendKeys(entertxt);
	}
	public void post(String entertxt){
		driver.findElement(Postcode).sendKeys(entertxt);
	}
	public void city(String enterTxt){
		driver.findElement(city).sendKeys(enterTxt);
	}
	public void state(String enterTxt){
		driver.findElement(State).sendKeys(enterTxt);
	}
	//select dropdown
	public void country(){
		Select dropdown =new Select(driver.findElement(Country));
		dropdown.selectByVisibleText("India");
	}
	public void telephone(String entertxt){
		driver.findElement(Telephone).sendKeys(entertxt);
	}
	public void news(){
		driver.findElement(NewsSletter).click();
	}
	public void Password(String enterTxt){
		driver.findElement(Password).sendKeys(enterTxt);
	}
	public void conformpass(String entertxt){
		driver.findElement(conformPassWord).sendKeys(entertxt);
	}
	public void Submit(){
		driver.findElement(Continue).click();
		System.out.println(driver.getTitle());
		
	}
	public void getallLinks(){
		
		List<WebElement> allLinks= driver.findElements(AllLinks);	
		int count=allLinks.size();
		System.out.println("all Links Present:"+allLinks);
		
		for(int i=0;i<count;i++){
			System.out.println(allLinks.get(i).getAttribute("href"));
		}
} 
}