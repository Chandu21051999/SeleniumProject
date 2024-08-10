package practiceScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticefirstScript {

		@BeforeTest
		public void signIn() {
		System.out.println("login the application");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandu\\Documents\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
        driver.get("https://accounts.vmmaps.com/");
        driver.manage().window().maximize();
		}
		
        @Test
		public void enter() {
        	System.out.println("Enter Email id");
        	
        }
		
		}

	
