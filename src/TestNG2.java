import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG2 {

@BeforeTest
	  public void before() {
		  System.out.println("browser open");
	  }
	
@Test
	
  public void giddu(){ 
	  System.out.println("giddaiah");
	  
  
}
@Test
	  public void raghu(){
		  System.out.println("login");
	  }


@Test
public void sandya(){
	  System.out.println("In");
}
@Test
public void sai(){
	  System.out.println("Gmail");
}


 @AfterTest
 
  public void afterTest() {
	  System.out.println("brower closed");
  }

}
