package com.Angelone.POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Angelone.Testpackage.TestBaseClass;

public class LogOutPOM {
	WebDriver driver;
//	Actions act;
	public LogOutPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
//		act = new Actions(driver);
	}
	@FindBy (xpath="(//a[@class='dropdown-toggle'])[10]")
	private WebElement profile;
	public void clickProfile()
	{
//		act.moveToElement(profile);
		profile.click();
	}	
	
	@FindBy (xpath="//a[text()='Logout']")
    private WebElement logout;
    public void clicklogout()
    {
    	logout.click();
    }
    

}
