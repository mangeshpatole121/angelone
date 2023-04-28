package com.Angelone.Testpackage;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Angelone.POMpackage.HomePagePOMclass;
import com.Angelone.POMpackage.LoginPOMclass;
import com.Project.UtilityClasess.ScreenShotzclass;


public class TC02VarifyWeAreAbleToSelectSymbolORnot extends TestBaseClass
{
	@Test
	public void selectSymbol() throws InterruptedException, IOException
	{
	HomePagePOMclass hp = new HomePagePOMclass(driver);
	Thread.sleep(2000);
	hp.clickWatchlist();
	hp.searchit();	
	Thread.sleep(2000);
	hp.methoddroplist();
	
	System.out.println("LIC is selected as a share to buy");
	ScreenShotzclass.methodScreenshot(driver);
	

			
		hp.clickBuyButton();
		ScreenShotzclass.methodScreenshot(driver);
		
		hp.giveQTYofStocks();
		hp.giveQTYofStocks2();
		System.out.println("2 stocks are selected ");		
		ScreenShotzclass.methodScreenshot(driver);
		hp.clicksubmit();
		System.out.println("clicked on submitt buttom");
		hp.clickCONFIRM(); 
		System.out.println("clicked on confirm buttom");
		ScreenShotzclass.methodScreenshot(driver);
	}
	


}
