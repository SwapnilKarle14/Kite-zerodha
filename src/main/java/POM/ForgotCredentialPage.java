package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotCredentialPage {
    
	@FindBy(xpath="//label[@for='\radio-31\']") private WebElement Radio1;
	@FindBy(xpath="//label[@for='radio-32']") private WebElement Radio2;
	@FindBy(xpath="//input[@placeholder='User ID']") private WebElement user;
	@FindBy(xpath="//input[@placeholder='PAN']") private WebElement PanID;
	@FindBy(xpath="for=\"radio-36\"") private WebElement Radio3;
	@FindBy(xpath="//label[@for='radio-37']") private WebElement Radio4;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']") private WebElement emailaddress;
	@FindBy(xpath="//input[@placeholder='Captcha']") private WebElement captcha;
	@FindBy(xpath="//button[@type='submit']") private WebElement button;
	@FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']") private WebElement Backbutton;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement SignUp;
	
	public void ForgotCredentialPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	public void ClickOnRadio1() {
		Radio1.click();
	}
	public void ClickOnRadio2() {
		Radio2.click();
	}
	public void EnterUserAddress(String username) {
		user.sendKeys(username);
	}
	public void EnterPanID(String pin) {
		PanID.sendKeys(pin);
	}
	public void ClickOnRadio3() {
		Radio3.click();
	}
	public void ClickOnRadio4() {
		Radio4.click();
	}
	public void EnterEmailAddres(String email) {
		emailaddress.sendKeys(email);
	}
	public void EnterCaptcha(String AlphaNum) {
		captcha.sendKeys(AlphaNum);
	}
	public void Submit() {
		button.click();
	}
	public void GoToBackPage() {
		Backbutton.click();
	}
	public void GoToSignUpPage() {
	 SignUp.click();
	}
}
