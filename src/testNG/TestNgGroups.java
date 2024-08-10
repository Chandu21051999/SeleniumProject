package testNG;

import org.testng.annotations.Test;

public class TestNgGroups {
	public class TestCase1 { 
   @Test (groups = { "smokeTest" }) 
	 public void loginTest(){ 
		 System.out.println("Logged in successfully"); 
		 
		 } 
	}
	
   public class TestCase2 { 
	   @Test (groups = { "functionality" }) 
	   
		 public void composemail(){ 
			 System.out.println("mailsent");
	   }
	   
   }
   
}
	

