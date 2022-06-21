package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.HomePageActions;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;
import Utility.ScreenShot;

public class ZerodhShareBuy {

	WebDriver driver;
	@BeforeMethod
	
	public void Browser() {
	 driver= POJO.Browser.openBrowser();
	}
	@Test
	public void LogIn() throws EncryptedDocumentException, IOException, InterruptedException{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String username =Parametrization.getData("credential", 0, 1);
		String password =Parametrization.getData("credential", 1, 1);
		zerodhaLoginPage.enterUserId(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
		
		Thread.sleep(2000);
		
		ZerodhaPinPage zerodhaPinPage =new ZerodhaPinPage(driver);
		String Pin = Parametrization.getData("credential", 2, 1);
		zerodhaPinPage.enterPinNum(Pin);
		zerodhaPinPage.clickOnSubmit();
		
		HomePageActions homePageActions =new HomePageActions(driver);
		String ShareName = Parametrization.getData("credential", 3, 1);
		System.out.println(ShareName);
		Thread.sleep(3000);
		homePageActions.EnterShare(ShareName);
		homePageActions.ClickOnBuyButton(driver);
		ScreenShot.TakeScreenShot(driver,1);
		homePageActions.RadioClickOnBSE();
		ScreenShot.TakeScreenShot(driver, 2);
		homePageActions.RadioClickOnNSE();
		ScreenShot.TakeScreenShot(driver, 3);
		homePageActions.RadioClickOnIntraday();
		ScreenShot.TakeScreenShot(driver, 4);
		homePageActions.RadioClickOnLongterm();
		ScreenShot.TakeScreenShot(driver, 5);
		homePageActions.MarketValuesClick();
		ScreenShot.TakeScreenShot(driver, 6);
		homePageActions.ClickOnBuySubmit();
		ScreenShot.TakeScreenShot(driver, 7);
		homePageActions.ClickOnSwitch();
		ScreenShot.TakeScreenShot(driver, 8);
		homePageActions.ClickOnSellSubmit();
		ScreenShot.TakeScreenShot(driver, 9);
		
		
	}
}
