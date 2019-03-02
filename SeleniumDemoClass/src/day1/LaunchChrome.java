package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		 System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
//			
//			//Instantiate Web Driver
//			WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		WebElement link=driver.findElement(By.linkText("Sign in"));
		link.click();
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("santoshin.mca@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("santoshimaa");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\'passwordNext\']/content/span")).click();
	    driver.findElement(By.id("idvPin")).sendKeys("12345");
	    
	}

}
