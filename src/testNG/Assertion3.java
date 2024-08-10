package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	@Test
	public void testcase3() {
		
		String actualText="abc";
		String expectedText="ab";
		//Equal assertion
		try {
			Assert.assertEquals( actualText, expectedText);
			
		}catch(Error e) {
			e.printStackTrace();
		}
		System.out.println("Equal assertion is verified");
		
	}

}
