package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchBrowser {

	public static void main(String[] args) {
     System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
				
		//Instantiate Web Driver
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Page title is - " + driver.getTitle());
		
		//Search on Google
		driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
		
			e.printStackTrace();
		}
		//Display number of results on Console
		System.out.println("Total Results - " + driver.findElement(By.id("resultStats")).getText());
		

	}

}
