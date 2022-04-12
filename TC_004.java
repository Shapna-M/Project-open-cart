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

public class TC_004 {
static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//ExtentSparkReporter reporter=new ExtentSparkReporter("./Test5.html");
		//ExtentReports extent = new ExtentReports();
		//extent.attachReporter(reporter);
		//ExtentTest test = extent.createTest("TC004-Euro Currency ");
		try {
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).click();
			System.out.println("CURRENCY IS PRESENT");
			//if(driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).getAttribute("xpath").equals("//*[@id=\"form-currency\"]/div/button"))
			//{
			//	test.pass("Currency visible");
			//}
			//else
			//{
				//TakesScreenshot sshot9 = ((TakesScreenshot)driver);
		        //File src9= sshot9.getScreenshotAs(OutputType.FILE);
		        //File dest9 = new File("./pic8.png");
		        //FileHandler.copy(src9, dest9);
		        
			    //test.fail("Not visible",MediaEntityBuilder.createScreenCaptureFromPath("pic8.png").build());
			//}
			driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button")).click();
			System.out.println("EURO IS PRESENT");
			//if(driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button")).getAttribute("name").equals("EUR"))
			//{
				
				//test.pass("EURO AVAILABLE");
			//}
			//else
			//{
				//TakesScreenshot sshot10 = ((TakesScreenshot)driver);
		        //File src10= sshot10.getScreenshotAs(OutputType.FILE);
		        //File dest10 = new File("./pic9.png");
		        //FileHandler.copy(src10, dest10);
		        
			    //test.fail("EURO UNAVAILABLE",MediaEntityBuilder.createScreenCaptureFromPath("pic9.png").build());
			//}
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]")).click();
			System.out.println("The product prices are in euro");
			//if(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]")).getAttribute("xpath").equals("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]"))
			//{
				//test.pass("Displaying in euro");
			//}
			//else
			//{
				//TakesScreenshot sshot11 = ((TakesScreenshot)driver);
		        //File src11= sshot11.getScreenshotAs(OutputType.FILE);
		        //File des11 = new File("./pic10.png");
		        //FileHandler.copy(src11, des11);
		        
			    //test.fail("Not present",MediaEntityBuilder.createScreenCaptureFromPath("pic10.png").build());
			//}
			driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
			System.out.println("The final bill is also in euro");
			//if(driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).getAttribute("xpath").equals("//*[@id=\"cart\"]/button"))
			//{
				//test.pass("displayed");
			//}
			//else
			//{
				//TakesScreenshot sshot12= ((TakesScreenshot)driver);
		       // File src12= sshot12.getScreenshotAs(OutputType.FILE);
		        //File dest12 = new File("./pic11.png");
		        //FileHandler.copy(src12, dest12);
		        
			    //test.fail("not displayed",MediaEntityBuilder.createScreenCaptureFromPath("pic11.png").build());
			//}
			//extent.flush();
				
			
	}catch(Exception e) {
	     e.printStackTrace();		
	}

	}

}
