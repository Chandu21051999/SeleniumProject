package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion2 {

	@Test
	public void testcase2() {
		
	
	String actualText="ab";
	String expectedText="ab";
	int a=10;
	int b=20;
	
	//Assert equals

	Assert.assertEquals(actualText ,expectedText ,"Actual and Expcted are not macthing");
	System.out.println("Equal assertion verified");
	//false assertion
	Assert.assertFalse(a>b);
	System.out.println("False assertion is verified");
	//True Assertion
	Assert.assertTrue(a>b);
	//assertion is failed ,text execution will stopped
	//further line code will not be executed
	System.out.println("True assertion is verified");
	}
	public void testcase3() {
		//assertion is written is written is test case methof
		//scope of assertion test case assertion limited to testcse2 only
		System.out.println("hellow method");
	}
	//
	
	
	
	
	
	
	
}
