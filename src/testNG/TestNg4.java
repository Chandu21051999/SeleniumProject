package testNG;

import org.testng.annotations.Test;

public class TestNg4 {
	
	@Test
	public void a() {
		System.out.println("hello a test method ");
	}
	
	@Test(invocationCount=2,priority=-1,enabled=false&true)
	public void b() {
		System.out.println("hellob test method ");
	}


}
