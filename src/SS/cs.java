package SS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class cs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hii");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandu\\Documents\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//driver.get("https://www.guru99.com/first-webdriver-script.html");)
		driver.manage().window().maximize();
	}
	

}
