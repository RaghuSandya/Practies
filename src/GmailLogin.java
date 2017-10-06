import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("gb_P")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("giddu4qe@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("8142586250");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='gb_mb']")).click();
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
	}

}
