package TestNG;

import org.testng.annotations.Test;

import BaseClass.BaseBowsers;

public class ExdCls extends BaseBowsers{
  @Test
  public void giddu() {
	  System.out.println("facebook ...");
	  driver.get("https://www.yatra.com");
	  
  }
}
