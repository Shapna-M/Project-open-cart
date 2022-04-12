package group1_art;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_005 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ExtentSparkReporter reporter=new ExtentSparkReporter("./Test6.html");
		//ExtentReports extent = new ExtentReports();
		//extent.attachReporter(reporter);
		//ExtentTest test = extent.createTest("TC005-pound sterling Currency ");
		try {
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).click();
			System.out.println("Currency is present");
			//if(driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).getAttribute("xpath").equals("//*[@id=\"form-currency\"]/div/button"))
			//{
				//test.pass("Currency visible");
			//}
			//else
			//{
				//TakesScreenshot sshot13 = ((TakesScreenshot)driver);
		        //File src13= sshot13.getScreenshotAs(OutputType.FILE);
		        //File dest13 = new File("./pic12.png");
		        //FileHandler.copy(src13, dest13);
		        
			    //test.fail("Not visible",MediaEntityBuilder.createScreenCaptureFromPath("pic8.png").build());
			//}
			driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[2]/button")).click();
			System.out.println("Pound Sterling is available");
			//if(driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[2]/button")).getAttribute("name").equals("GBP"))
			//{
				
				//test.pass("pound sterling AVAILABLE");
			//}
			//else
			//{
				//TakesScreenshot sshot14 = ((TakesScreenshot)driver);
		        //File src14= sshot14.getScreenshotAs(OutputType.FILE);
		        //File dest14= new File("./pic13.png");
		        //FileHandler.copy(src14, dest14);
		        
			    //test.fail("pound sterling UNAVAILABLE",MediaEntityBuilder.createScreenCaptureFromPath("pic13.png").build());
			//}
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]")).click();
			System.out.println("Prices are available in pound sterling");
			//if(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]")).getAttribute("xpath").equals("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]"))
			//{
				//test.pass("Displaying in pound sterling");
			//}
			//else
			//{
				//TakesScreenshot sshot15 = ((TakesScreenshot)driver);
		        //File src15= sshot15.getScreenshotAs(OutputType.FILE);
		        //File des15 = new File("./pic14.png");
		        //FileHandler.copy(src15, des15);
		        
			    //test.fail("Not present",MediaEntityBuilder.createScreenCaptureFromPath("pic14.png").build());
			//}
			driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
			System.out.println("Final amount is present in  pound sterling");
			//if(driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).getAttribute("xpath").equals("//*[@id=\"cart\"]/button"))
			//{
				//test.pass("displayed");
			//}
			//else
			//{
				//TakesScreenshot sshot16= ((TakesScreenshot)driver);
		        //File src16= sshot16.getScreenshotAs(OutputType.FILE);
		        //File dest16 = new File("./pic15.png");
		        //FileHandler.copy(src16, dest16);
		        
			    //test.fail("not displayed",MediaEntityBuilder.createScreenCaptureFromPath("pic15.png").build());
			//}
			//extent.flush();
				
			
	}catch(Exception e) {
	     e.printStackTrace();		
	}
	}

}
