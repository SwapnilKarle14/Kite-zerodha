package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {

	@FindBy(xpath="//input[@autocomplete='off']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot 2FA?']") private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	
	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	public void enterPin(String pinNum, WebDriver driver) {
	// 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));//Explicit wait
	//   wait.until(ExpectedConditions.visibilityOf(pin));//WebDriver back the element in 500ms
	
        FluentWait <WebDriver> wait =new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(2000));//Total wait time
		wait.pollingEvery(Duration.ofMillis(10));//polling time or rechecking time
		wait.ignoring(Exception.class);//Exception ignore
	    wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinNum);
		
	}
	
	public void enterPinNum(String pinNum) {
		pin.sendKeys(pinNum);
	}
	
	public void clickOnSubmit() {
		submit.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnSingUp() {
		signup.click();
	}
	
}
