package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;

public class AssertOnGroup {
	@BeforeMethod
	  public void raghu() {
		  System.out.println("system open..");
	  }
	
	  @Test(groups="james")
	  public void test() {
		  System.out.println("gmail open");
		  Assert.assertEquals("test", "test1");
	  }
	  @Test(groups="bond")
	  public void test1() {
		  System.out.println("compose mail over..");
	  }
	  
	  @Test(dependsOnGroups="james")
	  public void test2() {
		  System.out.println("log out the mail...");
		 
	  }
	  
	@Test(groups="james")
	public void test4() {
	System.out.println("log the mail...");
	  }
	
	  @AfterMethod
	  public void giddu() {
		  System.out.println("system closed..");
	  }
}
