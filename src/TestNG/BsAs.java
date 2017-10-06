package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BsAs {
  @Test
  public void Bs() {
	  System.out.println("ravi is cute boys...");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Sandeep is dangerous....");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("giddaiah is a 007...");
  }
@BeforeTest
public void As(){
	System.out.println("dileep is normal person..");
}
@AfterTest
public void AB(){
	System.out.println("all are good testers...");
}
@BeforeClass
public void Gs(){
	System.out.println("softGen....");
}
@AfterClass
public void SS(){
	System.out.println("Paths to larn..");
}
@BeforeMethod
public void NS(){
	System.out.println("mani kumar my jaffa....");
}
@AfterMethod
public void MS(){
	System.out.println("Sandya is a beatiful girl..");
}
}
