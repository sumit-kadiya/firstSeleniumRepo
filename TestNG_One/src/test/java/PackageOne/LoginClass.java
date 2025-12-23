package PackageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {
	
	WebDriver driver;
	
	public LoginClass(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	By btn_navigate_login = By.xpath("//a[normalize-space()='Signup / Login']");
    By txt_login = By.xpath("//input[@data-qa='login-email']");
    By txt_pass = By.xpath("//input[@placeholder='Password']");
    By btn_login = By.xpath("//button[normalize-space()='Login']");
    
    //actions
    public void navigateToLogin() {
    	driver.findElement(btn_navigate_login).click();
    }
    
    public void enterUsername(String username) {
    	driver.findElement(txt_login).sendKeys(username);
    }
    
    public void enterPassword(String pass) {
    	driver.findElement(txt_pass).sendKeys(pass);
    }
    
    public void clickLogin() {
    	driver.findElement(btn_login).submit();
    }
    
    public void checkTitle(String title) {
    	if(driver.getTitle().equals(title)) System.out.println("test passed");
		else System.out.println("test failed");
    }

}
