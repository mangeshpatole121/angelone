package com.Angelone.Testpackage;

import java.io.IOException;


import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Angelone.POMpackage.LogOutPOM;
import com.Angelone.POMpackage.LoginPOMclass;
import com.Project.UtilityClasess.ScreenShotzclass;

public class TestBaseClass 
{
	WebDriver driver;
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void setup(String BrowserName) throws InterruptedException, IOException
	{
			if(BrowserName.equals("Chrome"))
				{
					System.setProperty("webdriver.chrome.driver", 
					"E:\\download software\\chromedriver_win32\\chromedriver.exe");
			
					driver = new ChromeDriver();
						System.out.println("chromebrower is opened");
				}
			else 
			{
				System.setProperty("webdriver.gecko.driver", 
				"E:\\download software\\chromedriver_win32\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
				driver = new FirefoxDriver();
				System.out.println("Firefox brower is opened");
			}
	driver.manage().window().maximize();
	driver.get("https://trade.angelbroking.com/Login");
	WebDriverWait explctwait = new WebDriverWait(driver,Duration.ofSeconds(60));	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	System.out.println("url is Entered");	
	Thread.sleep(2000);
	
	LoginPOMclass lp = new LoginPOMclass(driver);

	lp.sendusername();
	lp.sendpassword();
	Thread.sleep(2000);
	lp.clickLogin();	
	System.out.println("we have successfully login");
	Thread.sleep(2000);

	lp.closepopup();
	System.out.println("pop up is closed");
	}	   
   
    
    @AfterMethod
    public void teardown()
    {
    	driver.quit();
    	System.out.println("browser is closed");
    }
}
