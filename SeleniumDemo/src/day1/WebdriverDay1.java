package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverDay1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdrive.chrome.driver","C://chromedriver_win32/chromedriver.exe");		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.google.co.in");		
		String title=driver.getTitle();
		System.out.println("The Title of browser is:"+title);	
		try {
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			
		}
		driver.findElement(By.name("q")).sendKeys("Seleniumhq");

	}

}
