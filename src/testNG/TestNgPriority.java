package testNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNgPriority {

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before class");
	}
	@Test(priority=0)
	public void google() {
		System.out.println("Google");
		
	}
	@Test(priority=1)
	public void Gamil() {
		System.out.println("Gamil");
		
	}
	@Test(priority=2)
	public void Flipkart() {
		System.out.println("Flipkart");
		
	}
	@Test(priority=3)
	public void Amazon() {
		System.out.println("Amazon");
		
	}
	@Test(priority=0)
	public void Dmart() {
		System.out.println("Dmart");
		
	}
	@Test(priority=0)
	public void Snapdeal() {
		System.out.println("Snapdeal");
		
	}
	//this test cases will be skipped from the execution
	@Test(enabled=false)
	public void TRends() {
		System.out.println("Trends");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		
	}
	
}
