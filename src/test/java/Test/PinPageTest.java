package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class PinPageTest {
   WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser(){
		 driver = Browser.openBrowser();
		
	}
    @Test
    public void LogintoZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
    	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String username=Parametrization.getData("credential",0, 1);
		String password=Parametrization.getData ("credential", 1, 1);
		zerodhaLoginPage.enterUserId(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
		
		//Thread.sleep(2000);
		
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
		String pin=Parametrization.getData("credential", 2, 1);
		zerodhaPinPage.enterPin(pin, driver);
	//	zerodhaPinPage.clickOnSubmit();
		String homePage = driver.getTitle();
		String requiredTitle = "DashBoard/Kite";
		Assert.assertEquals(homePage,requiredTitle);
    }
    
    
}
