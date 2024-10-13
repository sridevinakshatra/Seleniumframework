package listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utilities.extentreport;

public class Mylisteners implements ITestListener {
	
	ExtentReports e ;
	ExtentTest et ;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	String name  =	result.getName();
	 et = e.createTest(name);
	et.log(Status.INFO, name + "test started successfully");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String name  =	result.getName();
		et.log(Status.PASS, name + "test passed successfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String name  =	result.getName();
		
WebDriver driver = null;
try {
	driver = (WebDriver)	result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
} catch (IllegalArgumentException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (NoSuchFieldException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SecurityException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		  File of = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  String df = System.getProperty("user.dir") + "\\screenshot\\" + name + ".png";

		  try {
			FileHandler.copy(of, new File(df));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  et.addScreenCaptureFromPath(df);
		  
		  
		  et.log(Status.INFO, name + result.getThrowable());  
		
		et.log(Status.FAIL, name + "test failed ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String name  =	result.getName();
		  et.log(Status.INFO, name + result.getThrowable());
		et.log(Status.SKIP, name + "test skipped ");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
 e =	extentreport.generatereport();
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		  e.flush();
	
	}

}
