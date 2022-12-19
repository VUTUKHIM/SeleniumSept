package UITests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests {

	
		
	@Test
    public void logintests() {
	System.setProperty("webdriver.chrome.driver", "C:\\seleniumsept\\chromedriver_win32\\chromedriver.exe");
	WebDriver Driver = new 	ChromeDriver();
	Driver.get("https://magento.softwaretestingboard.com/");
		
    }
}
