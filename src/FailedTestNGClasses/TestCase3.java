package FailedTestNGClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test
	
	public void WordPress(){
		
		System.out.println("Word press working fine...");
		Assert.assertTrue(false);
	}

}
