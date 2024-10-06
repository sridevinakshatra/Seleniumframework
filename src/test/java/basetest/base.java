package basetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class base {
	
	WebDriver driver;
	public Properties p;
	public Properties pd;
	
	
	public void loadproperty() throws IOException
	{
	
		try {
			 p = new Properties();
				File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\properties\\config.properties");
				FileInputStream fis = new FileInputStream(f);
				p.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
		
	}
	
	public void testdataload() throws IOException
	{

		try {
			 pd = new Properties();
				File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\testdata\\data.properties");
				FileInputStream fis = new FileInputStream(f);
				pd.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public WebDriver launchapplication(String browser)
{
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		  driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("safari"))
	{
		driver = new SafariDriver();
	}
	driver.get(p.getProperty("URL"));
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Enter the Store")).click();
	driver.findElement(By.linkText("Sign In")).click();
	return driver;
}
	

}
