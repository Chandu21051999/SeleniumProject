package testNG;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class RealTimeExample {
	@BeforeClass
	public void BeforeClass() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandu\\Documents\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	

	@Test(priority=1,enabled=false)
	public void VerifyGoogleUrl() {
		//String url= driver.getCurrentUrl();
		//System.out.println("url of the page:"+url);
			
		
	}
	
}
