package com.Project.UtilityClasess;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotzclass {
	public static void methodScreenshot(WebDriver driver) throws IOException
	{	
		Date date = new Date();
		DateFormat date1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
	    String date2=date1.format(date);
	    		    
		TakesScreenshot tc1 =(TakesScreenshot)driver;
		File source =tc1.getScreenshotAs(OutputType.FILE);
		File destination = new File("G:\\velocity classes\\ScreenShots\\loginpage"+date2+".png");
		FileHandler.copy(source, destination);
		System.out.println("screenshot is taken");
		
	}

}
