package CommomPoM;
import 	java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllLinksPage {
	public WebDriver driver;
	
	By AllLinks=By.tagName("a");
	
	public AllLinksPage(WebDriver driver){
		this.driver=driver;
		
	}
		
		public void getAllLinks() {
			
			List<WebElement> allLinks= driver.findElements(AllLinks);
			int count= allLinks.size();
			System.out.println("No of Links in the page:"+count);
			
			for(int i=0;i<count;i++) {
				System.out.println(allLinks.get(i).getAttribute("href"));
			}
			
		}
}
