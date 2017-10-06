package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfter {
	@BeforeSuite
    public void runsBeforeSuiteClassOne(){
        System.out.println("Running before suite from ClassTwo");
    }
    @AfterSuite(alwaysRun=true)
    public void runsAfterSuiteClassOne(){
        System.out.println("Running after suite from ClassTwo");
     }
    @Test(groups={"groupTwo"},description="Testing in class two's method one")
    public void methodOneFromClassTwo(){
        System.out.println("Written from methodOneFromClassTwo");
   }
    
    @Test(description="Testing in class one's method two", groups={"groupTwo"})
    public void methodTwoFromClassOne(){
        System.out.println("Written from methodTwoFromClassOne");
    }
    
    @Test(description="Testing in class one's method one",groups={"groupOne"})
    public void methodOneFromClassOne(){
        System.out.println("Written from methodOneFromClassOne ");
    }

}
