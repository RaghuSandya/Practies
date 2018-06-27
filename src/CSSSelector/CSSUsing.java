package CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSUsing {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.wordpress.org/");
		
		//cssSelector by Xpath 
		
		/*driver.findElement(By.cssSelector("input[name='log']")).sendKeys("ABCDEFG");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("ABCD");
		
		
		//Using cssSelector Id[#] and className[.]
		driver.findElement(By.cssSelector("input#user_login")).sendKeys("QWERTY");
		driver.findElement(By.cssSelector("input.input#user_pass")).sendKeys("ASDFGH");
		
		//Using Contains[*]
		driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("QWERTY");
		driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("ASDFGH");
		
		//Using cssSelector Star with[^]
		
		driver.findElement(By.cssSelector("input[id^='user'][name='log']")).sendKeys("QWERTY");
		driver.findElement(By.cssSelector("input[id^='user'][name='pwd']")).sendKeys("ASDFGH");*/
		
		//Using CssSelector End With[$]
		driver.findElement(By.cssSelector("input[id$='login']")).sendKeys("QWERTY");
		driver.findElement(By.cssSelector("input[id$='pass']")).sendKeys("ASDFGH");
		driver.findElement(By.cssSelector("input#rememberme")).click();
	}
}
