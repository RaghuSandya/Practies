package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;

public class BewAest {
	
		@BeforeMethod
		  public void raghu() {
			  System.out.println("system open..");
		  }
		  @Test
		  public void test() {
			  System.out.println("gmail open");
			  Assert.assertEquals(2>1, 2<1);
		  }
		  @Test(dependsOnMethods="test")
		  public void test1() {
			  System.out.println("compose mail over..");
		  }
		  @Test
		  public void test2() {
			  System.out.println("log out the mail...");
			  
		  }
		  @AfterMethod
		  public void giddu() {
			  System.out.println("system closed..");
		  }
}

