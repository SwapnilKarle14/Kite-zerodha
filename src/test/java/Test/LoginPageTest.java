package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class LoginPageTest {
    WebDriver driver;
	@BeforeMethod
	public void Browser(){
		 driver = Browser.openBrowser();
		
	}
	@Test
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String username=Parametrization.getData("credential",0, 1);
		String password=Parametrization.getData ("credential", 1, 1);
		zerodhaLoginPage.enterUserId(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
	
	}
	@Test
	public void ForgotPasswordLinkTest() {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgot();
	}
	@Test
	public void SignUpLinkTest() {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUp();
	}
	@Test
	public void LoginWithoutCredentialsTest() throws EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnLogin();
		String text = zerodhaLoginPage.getErrorTest();
		System.out.println(text);
	//	String expectedText = "User ID should be minimum 6 characters.";
		String expectedText = "User ID should be minimum 6 "; //for negative testing which shows error msg in console
	//	Assert.assertEquals (text, expectedText);//Hard Assert,if first test is failure then does not run next test & throws immediate exception.
		//Hard assert is mostly used for blocker defect present in the test.
		
		SoftAssert softAssert = new SoftAssert();//Soft Assert, if test get failure then next test also run , it does not throws exception.
		softAssert.assertEquals(text, expectedText);
		
		String username=Parametrization.getData("credential",0, 1);
		String password=Parametrization.getData ("credential", 1, 1);
		zerodhaLoginPage.enterUserId(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
	   
		softAssert.assertAll();//it shows all failure test exception in the console but it is write after puting all required credentials.
		//Soft assert mostly used for ,if any test failure but it doesn't impact on further tests. 
	}
	
	@AfterMethod
	public void closeBrowser() {
	//	driver.close();
	}
	@Test
	public void Demo() {
		System.out.println("New demo test added");
	
	}
}
