package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginClassTestCase {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest() {
		LoginClass obj = new LoginClass(driver);
		obj.navigateToLogin();
		obj.enterUsername("sumit@outlook.com");
		obj.enterPassword("sumit00000");
		obj.clickLogin();
		Assert.assertEquals(driver.getTitle(), "Automation Exercise");
		obj.checkTitle("Automation Exercise");
	}
}
