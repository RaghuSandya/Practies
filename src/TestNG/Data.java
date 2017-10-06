package TestNG;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import BaseClass.Supliers;



//import Utils.Suplier;

public class Data {
  @Test(dataProvider="dp")
  public void employeeDetails(int employeeID, String name) {
	  System.out.print("Name:"+name+"| ");
	  System.out.println("EmployeeID:"+employeeID);
  }
 @DataProvider
  public Object[][] dp() {
    return new Object[][] {
     new Object[] { 123, "Sandya" },
      new Object[] { 232, "Raghu" },
    };
  }
}
