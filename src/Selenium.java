import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver sc=new FirefoxDriver();
		//Thread.sleep(5000);
		sc.get("https://in.yahoo.com/");
sc.close();
	}

}
