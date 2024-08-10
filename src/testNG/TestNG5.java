package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 {
	@Test
	public void a() {
		Assert.assertTrue(3<12);
		System.out.println("a hello method");
	}
	@Test
	public void b1() {
		Assert.assertTrue(3>12);
		System.out.println("a hello method");
	}
	@Test(dependsOnMethods={"a","b1"})
	public void b() {
		System.out.println("b hello method");
	}

}
