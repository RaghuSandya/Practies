package TestNG;

import org.testng.annotations.Test;

//import BaseClass.AllBrows;
import BaseClass.BaseBowsers;

public class Gid extends BaseBowsers{
  @Test
  public void Test() {
	  driver.get("http://www.freejobalert.com");
  }
}
