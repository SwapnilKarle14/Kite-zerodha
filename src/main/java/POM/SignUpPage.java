package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
   
	@FindBy (xpath="//input[@name='mobile']") private WebElement MobNum;
	@FindBy (xpath="//button[@type='submit']") private WebElement button;
	@FindBy (xpath="//a[text()='Want to open an NRI account?']") private WebElement NewAccount;
	

    public void SignUpPage(WebDriver Driver) {
    	PageFactory.initElements(Driver,this);
    }
    public void EnterMobileNumber(String number) {
    	MobNum.sendKeys(number);
    }
    public void EnterSubmitButton() {
    	button.click();
    }
    public void EnterForNewNRIaccount() {
    	NewAccount.click();
    }
}       
