package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginBtn;
    
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String un,String psd)
	{
		username.sendKeys(un);
		password.sendKeys(psd);
		LoginBtn.click();
		return new HomePage();
	}
}
