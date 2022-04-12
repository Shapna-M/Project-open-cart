package group1_art;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;


public class opencart {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		try {
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		boolean b = driver.getPageSource().contains("Your Store");
		System.out.println("Expected title present");
	    driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	    driver.getPageSource().contains("Register Account");
	    System.out.println("Excepted title present");
	    //Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	    driver.getPageSource().contains("Excepted title present");
	    driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	    driver.getPageSource().contains("You must agree to the Privacy Policy!");
	    System.out.println("Warning is present");
	    driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).click();
	    driver.findElement(By.id("input-firstname")).sendKeys("Priya");
	    driver.findElement(By.name("lastname")).sendKeys("Dharshini");
	    driver.findElement(By.name("email")).sendKeys("dhoni07041154667@gmail.com");
	    driver.findElement(By.name("telephone")).sendKeys("867453920");
	    driver.findElement(By.name("password")).sendKeys("dhoni07");
	    driver.findElement(By.name("confirm")).sendKeys("dhoni07");
	    driver.findElement(By.name("newsletter")).click();
	    driver.findElement(By.name("agree")).click();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	    driver.getPageSource().contains("Your Account Has Been Created!");
	    System.out.println("Present");
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[1]/a")).click();
		System.out.println("the title is" + driver.getTitle());
		//driver.quit();
	} catch(Exception e) {
         e.printStackTrace();		
	}

	}

}
