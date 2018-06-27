package GcrLiveProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminInterFace {
	public static WebDriver driver;

	public void launchApplication() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gcrit.com/build3/admin/");
	}

	public void closeApplication() {
		driver.close();
	}

	// admin login
	public void adminLogin(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='tdb1']")).click();
	}

	// Add manufacturer
	public void addmanufacturer(String name) {
		driver.findElement(By.linkText("Manufacturers")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
		driver.findElement(By.xpath("//input[@name='manufacturers_name']")).sendKeys(name);
		driver.findElement(By.xpath("//button[@id='tdb1']")).click();
	}

	// add categaries/products
	public void addcategories(String Name) {
		driver.findElement(By.linkText("Categories/Products")).click();
		driver.findElement(By.xpath("//span[contains(text(),'New Category')]")).click();
		driver.findElement(By.xpath("//input[@name='categories_name[1]']")).sendKeys(Name);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	  public void addProduct(String name,String price,String value,String model,String weight){
	  driver.findElement(By.linkText("Categories/Products")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'New Product')]")). click();
	  driver.findElement(By.xpath("//input[@value='0']")).click();
	  driver.findElement(By.xpath("//input[@id='products_date_available']")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'8')]")).click();
	  Select drop=new Select(driver.findElement(By.xpath("//select[@name='manufacturers_id']")));
	  drop.selectByIndex(1);
	  driver.findElement(By.xpath("//input[@name='products_name[1]']")).sendKeys(name);
	  
	  Select dropdown=new Select(driver.findElement(By.xpath("//select[@name='products_tax_class_id']")));
	  dropdown.selectByIndex(1);
	  driver.findElement(By.xpath("//input[@name='products_price']")).sendKeys(price);
	  driver.findElement(By.xpath("//input[@name='products_quantity']")).sendKeys(value);
	  driver.findElement(By.xpath("//input[@name='products_model']")).sendKeys(model);
	  driver.findElement(By.xpath("//input[@name='products_weight']")).sendKeys(weight);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
	  
	  public void AddProduct(String title,String code,String SymL,String symR,String Deci,String Thou,String DP,String val){
		  driver.findElement(By.xpath("//a[contains(text(),'Localization')]")).click();
		  driver.findElement(By.linkText("Currencies")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'New Currency')]")).click();
		  driver.findElement(By.xpath("//input[@name='title']")).sendKeys(title);
		  driver.findElement(By.xpath("//input[@name='code']")).sendKeys(code);
		  driver.findElement(By.xpath("//input[@name='symbol_left']")).sendKeys(SymL);
		  driver.findElement(By.xpath("//input[@name='symbol_right']")).sendKeys(symR);
		  driver.findElement(By.xpath("//input[@name='decimal_point']")).sendKeys(Deci);
		  driver.findElement(By.xpath("//input[@name='thousands_point']")).sendKeys(Thou);
		  driver.findElement(By.xpath("//input[@name='decimal_places']")).sendKeys(DP);
		  driver.findElement(By.xpath("//input[@name='value']")).sendKeys(val);
		  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
	  

	public static void main(String[] args) {

		AdminInterFace obj = new AdminInterFace();

		// Test case 1:Verify launch application

		obj.launchApplication();
		boolean Username = driver.findElement(By.name("username")).isDisplayed();
		boolean PassWord = driver.findElement(By.name("password")).isDisplayed();
		boolean Login = driver.findElement(By.xpath("//button[@id='tdb1']")).isDisplayed();

		if (Username == true && PassWord == true && Login == true) {
			System.out.println("Test case 1:" + "Username,PassWord And Login Elements Exits passed");
		} else {
			System.out.println("Test case 1:" + "Username,PassWord And Login Elements Not Exits Failed");
		}
		obj.closeApplication();
		

		// Test case 2:Verify "Admin Login"in gcrshop portal with valid Inputs

		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");

		String Url = driver.getCurrentUrl();

		if (Url.equals("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Test case 2:" + "Admin login successful--Passed");
		} else {
			System.out.println("Test case 2:" + "Admin login  unsuccessful--Failed");
		}
		obj.closeApplication();

		// Tes tCase 3:Verify "Important/Requried Elements availability"in
		// gcrshop portal

		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");

		boolean manufacture = driver.findElement(By.linkText("Manufacturers")).isDisplayed();
		boolean catandprod = driver.findElement(By.linkText("Categories/Products")).isDisplayed();

		if (manufacture == true && catandprod == true) {
			System.out.println("Test Case 3:" + "manufactures,categeries and products elements availble -- passed");
		} else {
			System.out.println("Test Case 3:" + "manufactures,categeries and products elements unavailble -- Failed");
		}
		obj.closeApplication();

		// Test case 4 :Verify "Add manufacture"in gcrshop portal admin interface index

		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		obj.addmanufacturer("008");
		String Man_count = driver.findElement(By.xpath("//strong[contains(text(),'1335')]")).getText();
		int Manf_count = Integer.parseInt(Man_count);
		driver.navigate().refresh();
		if (Manf_count == 1330) {
			System.out.println("Test case 4 :" + "manufacturer added--Passed");
		} else {
			System.out.println("Test case 4 :" + "manufacturer not added--Failed");
		}
		obj.closeApplication();
		
		
		//Test case 5:Verify "Add Categories"in gcrshop Portal
		
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		obj.addcategories("02");
		boolean Ma_count=driver.findElement(By.xpath("//strong[contains(text(),'02')]")).isDisplayed();

		if(Ma_count==true){
			System.out.println("Test case 5:"+"add categeries passed");
		}else{
			System.out.println("Test case 5:"+"add categeries Failed");
		}
		obj.closeApplication();
		
		
		//Test case 6:Verify "Add Product"in gcrshop Portal
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		obj.addProduct("james", "25", "2", "AK", "15");
		boolean count=driver.findElement(By.xpath("//span[contains(text(),'Copy To')]")).isDisplayed();
		if(count==true){
			System.out.println("Test case 6:"+"Verify Add Product Passed");
		}else{
			System.out.println("Test case 6:"+"Verify Add Product Failed");
		}
		obj.closeApplication();
		
	}
}
