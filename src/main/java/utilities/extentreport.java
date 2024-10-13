package utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreport {
	
	public static ExtentReports generatereport()
	{
		ExtentReports exp = new ExtentReports();
		File fi = new File(System.getProperty("user.dir")+"\\test-output\\ExtentReports\\extentreport.html");
		ExtentSparkReporter exps = new ExtentSparkReporter(fi);
		exps.config().setTheme(Theme.STANDARD);
		exps.config().setReportName("Ecommerce Report");
		exps.config().setDocumentTitle("EC Automation report");
		exps.config().setTimeStampFormat("dd/MM/YYYY hh:mm:ss");
		exp.attachReporter(exps);
		return exp;
		
	}
	

}
