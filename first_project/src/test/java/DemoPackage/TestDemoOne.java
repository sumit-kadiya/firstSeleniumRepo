package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://practice.expandtesting.com/radio-buttons");
			
		
			
			List<WebElement> li = driver.findElements(By.name("color"));
			
			System.out.println(li.size());
			Thread.sleep(2000);
			
			li.get(0).click();
			Thread.sleep(500);
			li.get(2).click();
			Thread.sleep(500);
			li.get(1).click();
			Thread.sleep(500);
			
			
			for(WebElement ele: li) {
				if(ele.isSelected()) System.out.println(ele.getAttribute("value"));
			}
			
			
		} catch(Exception e) {
			System.out.println(e.getClass().getSimpleName());
			
		}

	}

}
