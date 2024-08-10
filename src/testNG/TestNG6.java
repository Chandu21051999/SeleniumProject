package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestNG6 {
	WebDriver driver;
	
	@BeforeClass
	public void setenv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandu\\Documents\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver =new ChromeDriver();
		
		//driver.get("https://www.guru99.com/first-webdriver-script.html");)
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println();
	}

}
