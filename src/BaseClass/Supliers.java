package BaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Supliers {
  
@DataProvider
  public Object[][] Employeess (){
    return new Object[][] {
      new Object[] { 100, "anil" },
      new Object[] { 200, "billa" },
    };
  }
}
