package group1_art;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentSparkReporter reporter=new ExtentSparkReporter("./TestReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest test = extent.createTest("TC001-Search product");
		test.pass("Enter the product name");
		test.pass("check the product is tested");
		test.pass("Add the product to the cart");
		
		ExtentTest test2 = extent.createTest("TC002-payment");
		test2.pass("navigate to the payment page");
		test2.fail("Payment failed");
		extent.flush();
		

	}

}
