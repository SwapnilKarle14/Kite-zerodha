package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
     
	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
	//	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);//universal wait applicable for every instance of webdriver.
		return driver;
	}
}
