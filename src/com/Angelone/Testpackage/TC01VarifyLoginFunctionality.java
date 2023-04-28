package com.Angelone.Testpackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Angelone.POMpackage.LoginPOMclass;
import com.Project.UtilityClasess.ScreenShotzclass;

public class TC01VarifyLoginFunctionality extends TestBaseClass
{
	
	@Test
	public void method() throws IOException, InterruptedException
	{
		
	String actualURL = driver.getCurrentUrl();
	System.out.println("actual url is ="+actualURL);
	String urlRecieved=" URL Given =https://trade.angelbroking.com/Login"; 
	
	 
    
//	Assert.assertEquals(actualURL, urlRecieved);	
	
	String titleName = driver.getTitle();
	System.out.println("actual titleName="+titleName);
	String givenTitle="angel one";
	System.out.println("given tileName = angel one");
	
//	Assert.assertEquals(givenTitle, titleName, "title name validation");
	
	
	}
}
