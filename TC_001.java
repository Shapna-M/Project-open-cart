package group1_art;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {
static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
			System.out.println("passed");
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
			System.out.println("passed");
			driver.findElement(By.name("firstname")).sendKeys("Shapna");
			System.out.println("passed");
			driver.findElement(By.name("lastname")).sendKeys("M");
			System.out.println("passed");
			driver.findElement(By.name("email")).sendKeys("tnipl2k22april@gmail.com");
			System.out.println("passed");
			driver.findElement(By.name("telephone")).sendKeys("7865432133");
			System.out.println("passed");
			driver.findElement(By.name("password")).sendKeys("hello");
			System.out.println("passed");
			driver.findElement(By.name("confirm")).sendKeys("hello");
			System.out.println("passed");
			//Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
			System.out.println("passed");
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
			System.out.println("passed");
			
            
			
		 
			
		} catch(Exception e) {
		     e.printStackTrace();		
		}

	}

}
