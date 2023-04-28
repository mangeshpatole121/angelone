package com.Angelone.POMpackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Angelone.Testpackage.TestBaseClass;

public class LoginPOMclass 
{
	private WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='txtUserID']")
	private WebElement username;
	public void sendusername()
	{
		username.sendKeys("M796414");
	}
	
	@FindBy(xpath="//input[@id='txtTradingPassword']")
	private WebElement password;
	
	
	public void sendpassword()
	{
		password.sendKeys("Mangesh@123");
	}
	@FindBy(xpath="//a[@id='loginBtn']")
	private WebElement loginbtn;
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	@FindBy(xpath="/html/body/div[3]/div[5]/div/button")
	private WebElement popup;
	public void closepopup()
	{
		popup.click();
		System.out.println("pop up is closed and we are now on the homepage");
	}	
	
	
	public LoginPOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	
	
	
	
	
	
}
