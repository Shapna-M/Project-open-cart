package group1_art;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
public class lab6opcontd {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=42");
			driver.findElement(By.linkText("Description")).click();
			Actions act=new Actions(driver);
			act.sendKeys(Keys.TAB)
			.sendKeys(Keys.ENTER)
			.build().perform();
			String text = driver.findElement(By.xpath("//*[@id=\"tab-specification\"]/table/tbody/tr/td[1]")).getText();
			if(text.contains("Clockspeed"))
				System.out.println("Present");
			else
				System.out.println("Not Present");
			String text1 = driver.findElement(By.xpath("//*[@id=\"tab-specification\"]/table/tbody/tr/td[2]")).getText();
			if(text1.contains("100mhz"))
				System.out.println("Ok");
			else
				System.out.println("Not ok");
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
			driver.getPageSource().contains("Success");
			driver.findElement(By.name("search")).sendKeys("Mobile");
			driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
			driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
			driver.findElement(By.id("button-search")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();
			driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).clear();
			driver.findElement(By.name("quantity")).sendKeys("2");
			driver.findElement(By.id("button-cart")).click();
			driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
			
			
			
			
				
			
			
			
			
		} catch(Exception e) {
		     e.printStackTrace();		
		}


	}

}
