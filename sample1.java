package group1_art;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sample1 {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		try {
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
	    WebElement element = driver.findElement(By.name("search"));
		element.sendKeys("Smart Phones");
		WebElement element1 = driver.findElement(By.name("code"));
		element1.submit();
		System.out.println("the title is" + driver.getTitle());
		driver.quit();
	} catch(Exception e) {
         e.printStackTrace();		
	}
		

	}

}
