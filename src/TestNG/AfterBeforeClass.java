package TestNG;

import org.testng.annotations.Test;

import BaseClass.BaseBowsers;

public class AfterBeforeClass extends BaseBowsers {
  @Test
  public void giddu() {
	  System.out.println("gmail open...");
  }
  @Test
  public void raghu() {
	  System.out.println("mail composing...");
 }
  @Test
  public void sandya() {
	  System.out.println("mail sending over...");
  }
}
