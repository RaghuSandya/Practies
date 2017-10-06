package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;

public class Depends {
	
		@BeforeMethod
		  public void raghu() {
			  System.out.println("system open..");
		  }
		
		  @Test(groups="ravi")
		  
		  public void test() {
			  System.out.println("gmail open");
			 
		  }
		  @Test(groups="single")
		  
		  public void test1() {
			  System.out.println("compose mail over..");
		  }
		  
		  @Test(dependsOnGroups="ravi")
		  public void test2() {
			  System.out.println("log out the mail...");
		  }
		  @Test(groups="ravi")
		  public void test4() {
			System.out.println("log the mail...");
		  }
		  @AfterMethod
		  public void giddu() {
			  System.out.println("system closed..");
		  }
}
