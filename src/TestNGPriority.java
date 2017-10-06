import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGPriority {
	@BeforeTest
	  public void before() {
		  System.out.println("browser open");
	  }
	
@Test(priority=1)
	
public void giddu(){ 
	  System.out.println("giddaiah");
	  

}
@Test(priority=2)
	  public void raghu(){
		  System.out.println("login");
	  }


@Test(priority=3)
public void sandya(){
	  System.out.println("In");
}
@Test(priority=4)
public void sai(){
	  System.out.println("Gmail");
}


@AfterTest

public void afterTest() {
	  System.out.println("brower closed");
}

}
