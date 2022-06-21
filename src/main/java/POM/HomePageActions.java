package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
    
	@FindBy(xpath="//input[@type='text']") private WebElement SearchBox;
	@FindBy(xpath="(//span[@class=\"symbol\"])[2]") private WebElement Share;
	@FindBy(xpath="//button[@class='button-blue buy']") private WebElement Buy;
	@FindBy(xpath="//label[@for='radio-173']") private WebElement RadioBSE;
	@FindBy(xpath="//label[@for='radio-174']") private WebElement RadioNSE;
	@FindBy(xpath="//label[@for='radio-181']") private WebElement RadioIntraday;
	@FindBy(xpath="//label[@for='radio-176']") private WebElement RadioLongterm;
	@FindBy(xpath="//input[@label='Qty.']") private WebElement QtyBox;
	@FindBy(xpath="//input[@label='Price']") private WebElement PriceBox;
	@FindBy(xpath="//label[@for='radio-190']") private WebElement RadioMkt;
	@FindBy(xpath="//label[@for='radio-191']") private WebElement RadioLimit;
	@FindBy(xpath="//label[@for='radio-184']") private WebElement RadioSL;
	@FindBy(xpath="//label[@for='radio-185']") private WebElement RadioSLM;
	@FindBy(xpath="//span[@data-balloon='More options']") private WebElement MoreOption;
	@FindBy(xpath="//button[@type='submit']") private WebElement Submit;
	@FindBy(xpath="//button[@class='button-outline cancel']") private WebElement Cancel;
	@FindBy(xpath="//label[@class='su-switch-control']") private WebElement Switch;
	@FindBy(xpath="//button[@type='submit']") private WebElement SellSubmit;
	
	public HomePageActions(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void EnterShare(String Share) {
		SearchBox.click();
		SearchBox.sendKeys(Share);
	}
	public void ClickOnBuyButton(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(Share).perform();
		action.moveToElement(Buy);
		action.click();
		action.perform();
	}
	public void RadioClickOnBSE() throws InterruptedException {
		Thread.sleep(2000);
		RadioBSE.click();
	}
	public void RadioClickOnNSE()  {
		RadioNSE.click();
	}
	public void RadioClickOnIntraday()  {
		RadioIntraday.click();
	}
	public void RadioClickOnLongterm() {
		RadioLongterm.click();
	}
	public void MarketValuesClick() {
		RadioMkt.click();
	}
	public void ClickOnBuySubmit() {
		Submit.click();
	}
	public void ClickOnSwitch() {
		Switch.click();
	}
	public void ClickOnSellSubmit() {
		SellSubmit.click();
	}
}
