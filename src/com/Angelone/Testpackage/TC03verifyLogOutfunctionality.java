package com.Angelone.Testpackage;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.Angelone.POMpackage.HomePagePOMclass;
import com.Angelone.POMpackage.LogOutPOM;
import com.Project.UtilityClasess.ScreenShotzclass;

public class TC03verifyLogOutfunctionality extends TestBaseClass {
	
	@Test
	public void VerifyLogOutFunctionality() throws IOException, InterruptedException 
	{
		LogOutPOM LG = new LogOutPOM(driver);
//	    Thread.sleep(2000);
	    LG.clickProfile();
	    Thread.sleep(2000);
	    LG.clicklogout();
	    ScreenShotzclass.methodScreenshot(driver);
	    System.out.println("successfullly logout");
	    
	    String titleName = driver.getTitle();
		System.out.println("actual titleName="+titleName);
		String givenTitle="angel one";
		System.out.println("given tileName = angel one");
//		Assert.assertEquals(titleName, givenTitle);
	}	 	   

}
