package Launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) throws Exception   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandu\\Documents\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //delete all cookies
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        //Open url using navigate method
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(5000);
        //navigate refresh
        driver.navigate().refresh();
        Thread.sleep(2000);
        //navigate back
        driver.navigate().back();
        Thread.sleep(2000);
        	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chandu@gmail.com");
        	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Chandu@123");
        	 driver.findElement(By.xpath("//button[@id='u_0_5_UX']")).click();
        	 
      //navigate forward
        driver.navigate().forward();
        Thread.sleep(2000);
        
        //fetch current url
       System.out.println(driver.getCurrentUrl());
       Thread.sleep(2000);
       //get title
       
       System.out.println(driver.getTitle());
       driver.close();
       driver.quit();
 	}

}
