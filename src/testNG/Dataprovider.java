package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test(dataProvider="getdata")
	
	public void logintest(String Username , String Password) {
		System.out.println("Username  is "+ Username);
		System.out.println("Username  is "+ Password);
		
	}
	
	@DataProvider(name="getdata")
	public Object[][] getdata() {
		
			Object[][] dataset=new Object[2][2];
			//first row
			dataset[0][0]="firstUsername";
			dataset[0][1]="firstPassword";
			
			//second row
			dataset[1][0]="SecondUsername";
			dataset[1][1]="SecondPAssword";
			//thrid
			//dataset[2][0]="user3";
			//dataset[2][1]="Pass3";
			//fourth row
			//dataset[3][0]="user4";
			//dataset[1][1]="Pass4";
			
			return dataset;
			
	}

}
