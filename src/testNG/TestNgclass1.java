package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgclass1 {
	
@Test
public void a() {
	System.out.println("Hello a test method");
		
	}
@BeforeTest
public void a1() {
	System.out.println("Hello a1 test method");
		
	}
@BeforeSuite
public void b() {
	System.out.println("Hello b test method");
		
	}
@AfterMethod
public void c() {
	System.out.println("Hello c test method");
		
	}
@BeforeClass
public void d() {
	System.out.println("Hello d test method");
		
	}
@BeforeMethod
public void e() {
	System.out.println("Hello e test method");
		
	}
@AfterSuite
public void f() {
	System.out.println("Hello f test method");
		
	}
@AfterClass
public void g() {
	System.out.println("Hello g test method");
		
	}
@Test
public void h() {
	System.out.println("Hello g test method");
		
	}

}
