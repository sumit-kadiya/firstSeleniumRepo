package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
//		driver.quit();
		
		String expectedResult = "Facebook – log in or sign up";
		String actualResult = driver.getTitle();
		
		
		if(expectedResult.equals(actualResult)) {
			System.out.println("MATCH");
		} else {
			System.out.println("No match!!!");
		}
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sumit@xyz.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("abc@123456");
		
		WebElement submitButton = driver.findElement(By.name("login"));
		submitButton.submit();
		
		String expResult = "Facebook";
		String realResult = driver.getTitle();
		
		if(expResult.equals(realResult)) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Something went wrong!!!");
		}
		
	}

}
