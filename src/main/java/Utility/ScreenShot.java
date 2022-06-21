package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void TakeScreenShot(WebDriver driver, int TestCaseID) throws IOException {
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
	
	File destination = new File("C:\\Users\\shree\\screenshots\\.jpeg");
	
	FileHandler.copy(source, destination);
	
   }
}
