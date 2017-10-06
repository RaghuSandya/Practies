import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcReg {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in");
		driver.findElement(By.xpath("//a[@href='/eticketing/userSignUp.jsf']")).click();
		
		//driver.findElement(By.xpath("//input[@id='userRegistrationForm:userName']")).sendKeys("giddu");
		
		driver.findElement(By.name("userRegistrationForm:userName")).sendKeys("giddu");
		driver.findElement(By.id("userRegistrationForm:password")).sendKeys("giddu@7");
		driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("giddu@7");
		
		// Selection Drop Down
		Select dropdown=new Select(driver.findElement(By.name("userRegistrationForm:securityQ")));
		dropdown.selectByIndex(1);
		
		driver.findElement(By.name("userRegistrationForm:securityAnswer")).sendKeys("raghu");
		
		Select sc=new Select(driver.findElement(By.name("userRegistrationForm:prelan")));
		sc.selectByIndex(0);
		
		driver.findElement(By.name("userRegistrationForm:firstName")).sendKeys("giddaiah");
		driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys("valkur");
		
		driver.findElement(By.name("userRegistrationForm:gender")).click();
		driver.findElement(By.id("userRegistrationForm:maritalStatus:1")).click();
		
		Select sc1=new Select(driver.findElement(By.id("userRegistrationForm:dobDay")));
		sc1.selectByIndex(8);
		
		Select sc2=new Select(driver.findElement(By.name("userRegistrationForm:dobMonth")));
		sc2.selectByIndex(7);
		
		Select sc3=new Select(driver.findElement(By.id("userRegistrationForm:dateOfBirth")));
		sc3.selectByVisibleText("1992");
		
		Select sc4=new Select(driver.findElement(By.id("userRegistrationForm:occupation")));
		sc4.selectByVisibleText("Student");
		
		Select sc5=new Select(driver.findElement(By.name("userRegistrationForm:countries")));
		sc5.selectByVisibleText("India");
		
		
		
		
		
		
		
		
	}

}
