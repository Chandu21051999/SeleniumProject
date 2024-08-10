package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGAssertion {
	@Test
	public void testcase1() {
		String expectedText="Facebook helps you connect and share with the people in your life.\r\n";
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandu\\Documents\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //String actualText=driver.findElement(By.xpath(""));)
		
	}

}
