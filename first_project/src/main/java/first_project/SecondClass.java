package first_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.cricbuzz.com/cricket-schedule/series/all");
			
			driver.navigate().to("https://chatgpt.com/");
			
			driver.navigate().back();
			
			driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div[1]/a[1]/span")).click();
			
			String text = driver.findElement(By.className("text-cbTxtLive")).getText();
			
			System.out.println(text);
			
			driver.manage().window().maximize();
			
			driver.manage().window().minimize();
			
			driver.quit();
		
		} catch(Exception e) {
			System.out.println(e.getClass().getSimpleName());
		}

	}

}
