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

public class TC_003 {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ExtentSparkReporter reporter=new ExtentSparkReporter("./Test4.html");
		//ExtentReports extent = new ExtentReports();
		//extent.attachReporter(reporter);
		//ExtentTest test = extent.createTest("TC003-Storelogo");
		try {
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			driver.findElement(By.name("search")).click();
			System.out.println("passed");
			//if(driver.findElement(By.xpath("//*[@id=\"search\"]/input")).getAttribute("name").equals("search"))
			//{
				//test.pass("Click search");
			//}
			//else
			//{
				//TakesScreenshot sshot5 = ((TakesScreenshot)driver);
		        //File src5= sshot5.getScreenshotAs(OutputType.FILE);
		        //File dest5 = new File("./pic4.png");
		        //FileHandler.copy(src5, dest5);
		        
			    //test.fail("click search",MediaEntityBuilder.createScreenCaptureFromPath("pic4.png").build());
			//}
			driver.findElement(By.name("search")).sendKeys("phone");
			System.out.println("passed");
			//if(driver.findElement(By.xpath("//*[@id=\"search\"]/input")).getAttribute("name").equals("search"))
			//{
				
				//test.pass("Enter phone");
			//}
			//else
			//{
				//TakesScreenshot sshot6 = ((TakesScreenshot)driver);
		        //File src6= sshot6.getScreenshotAs(OutputType.FILE);
		        //File dest6 = new File("./pic5.png");
		        //FileHandler.copy(src6, dest6);
		        
			    //test.fail("type phone",MediaEntityBuilder.createScreenCaptureFromPath("pic5.png").build());
			//}
			driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a")).click();
			System.out.println("passed");
			//if(driver.findElement(By.xpath("//*[@id=\\\"search\\\"]/span/button")).getAttribute("linkText").equals("Your Store"))
			//{
				//test.pass("Click search");
			//}
			//else
			//{
				//TakesScreenshot sshot7 = ((TakesScreenshot)driver);
		        //File src7= sshot7.getScreenshotAs(OutputType.FILE);
		        //File dest7 = new File("./pic6.png");
		        //FileHandler.copy(src7, dest7);
		        
			    //test.fail("type phone",MediaEntityBuilder.createScreenCaptureFromPath("pic6.png").build());
			//}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a")).click();
			System.out.println("passed");
			//if(driver.getTitle().equals("Your Logo"))
			//{
				//test.pass("displayed");
			//}
			//else
			//{
				//TakesScreenshot sshot8= ((TakesScreenshot)driver);
		        //File src8= sshot8.getScreenshotAs(OutputType.FILE);
		        //File dest8 = new File("./pic7.png");
		        //FileHandler.copy(src8, dest8);
		        
			    //test.fail("not displayed",MediaEntityBuilder.createScreenCaptureFromPath("pic7.png").build());
			//}
			//extent.flush();
				
			
	}catch(Exception e) {
	     e.printStackTrace();		
	}


}
}
