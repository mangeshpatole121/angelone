package com.Angelone.POMpackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Angelone.Testpackage.TestBaseClass;

public class HomePagePOMclass {
	
	private WebDriver driver;
	private Actions act; 
	
	public HomePagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	
	
	@FindBy(xpath="//a[@class='watchlistA']")
	private WebElement watchlist;
	public void clickWatchlist()
	{
		watchlist.click();
	}
	
	@FindBy(xpath="//input[@id='project']")
	private WebElement Txtbox;
	public void searchit()
	{
		Txtbox.sendKeys("LIC");
	}
	
	public void methoddroplist()
	{
		act.click(Txtbox).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
	
	@FindBy(xpath="/html/body/ul[2]/li[1]/div")
	private WebElement LICsymbol;
	public void clickLIC()
	{
		LICsymbol.click();
	}		
	
	@FindBy(xpath="//a[@id='watchlistBuy']")
	private WebElement Buybutton;
	public void clickBuyButton()
	{
		Buybutton.click();		
	}
	
	
	@FindBy(xpath="//input[@id='txtBuySellPopQuantity']")
	private WebElement quantityOFstocks;
	public void giveQTYofStocks()
	{
		quantityOFstocks.click();
	
	}
	
	public void giveQTYofStocks2()
	{
	
		quantityOFstocks.clear();
		quantityOFstocks.sendKeys("2");
		
	}

	@FindBy(xpath="//button[@id='btnOrderPadSubmit']")
	private WebElement submitbtn;
	public void clicksubmit()
	{
		submitbtn.click();
	}
	@FindBy(xpath="//button[text()='CONFIRM']")
	private WebElement CONFIRMBTN;
	public void clickCONFIRM()
	{
		CONFIRMBTN.click();
	}
		
}
