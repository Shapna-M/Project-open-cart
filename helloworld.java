package group1_art;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class helloworld {
static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		try {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("what is selenium");
		Thread.sleep(20000);
		element.submit();
		System.out.println("the title is" + driver.getTitle());
		driver.quit();
	} catch(Exception e) {
         e.printStackTrace();		
	}

}
}
