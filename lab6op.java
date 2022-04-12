package group1_art;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab6op {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
try {
	driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	driver.findElement(By.name("email")).sendKeys("dhoni070411546@gmail.com");
	driver.findElement(By.name("password")).sendKeys("dhoni07");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();
	driver.findElement(By.id("input-limit")).click();
	driver.findElement(By.xpath("//*[@id=\"input-limit\"]/option[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
} catch(Exception e) {
     e.printStackTrace();		
}


	}

}
