package testcase;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basetest.base;
import utilities.utilities;

public class register extends base {
	
	WebDriver driver;

@BeforeMethod
public void setup() throws IOException


{
	loadproperty();
	driver = launchapplication(p.getProperty("browser"));
	testdataload();
}

@AfterMethod
public void teardown()
{
	driver.quit();
}
	
	@Test(priority=1)
	public void formfill()
	{
		
	
		
		driver.findElement(By.linkText("Register Now!")).click();
		driver.findElement(By.cssSelector("[name='username']")).sendKeys(p.getProperty("newusername"));
		driver.findElement(By.cssSelector("[name='password']")).sendKeys(p.getProperty("newpassword"));
		driver.findElement(By.cssSelector("[name='repeatedPassword']")).sendKeys(p.getProperty("newpassword"));
		driver.findElement(By.cssSelector("[name='account.firstName']")).sendKeys(pd.getProperty("firstname"));
		driver.findElement(By.cssSelector("[name='account.lastName']")).sendKeys(pd.getProperty("lastName"));
		driver.findElement(By.cssSelector("[name='account.email']")).sendKeys(pd.getProperty("email"));
		driver.findElement(By.cssSelector("[name='account.phone']")).sendKeys(pd.getProperty("phone"));
		driver.findElement(By.cssSelector("[name='account.address1']")).sendKeys(pd.getProperty("address1"));
		driver.findElement(By.cssSelector("[name='account.city']")).sendKeys(pd.getProperty("city"));
		driver.findElement(By.cssSelector("[name='account.state']")).sendKeys(pd.getProperty("state"));
		driver.findElement(By.cssSelector("[name='account.zip']")).sendKeys(pd.getProperty("zip"));
		driver.findElement(By.cssSelector("[name='account.country']")).sendKeys(pd.getProperty("country"));
		WebElement dropdown = driver.findElement(By.cssSelector("[name='account.favouriteCategoryId']")) ;
		Select sc = new Select(dropdown);
		sc.selectByValue("DOGS");
		driver.findElement(By.cssSelector("[name='account.listOption']")).click();
		driver.findElement(By.cssSelector("[name='account.bannerOption']")).click();
		driver.findElement(By.cssSelector("[name='newAccount']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("(//img)[19]")).isDisplayed());
		
	}
	
	@Test(priority=2,dataProvider="datasupply")
	public void sign(String username,String password)
	{
	
		driver.findElement(By.cssSelector("[name='username']")).clear();
		driver.findElement(By.cssSelector("[name='username']")).sendKeys(username);
		driver.findElement(By.cssSelector("[name='password']")).clear();
		driver.findElement(By.cssSelector("[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("[name='signon']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Sign Out")).isDisplayed());
	
	}
	
	@DataProvider(name="datasupply")
	public Object[][] supplydata() throws IOException
	{
	
		Object[][]  ob= utilities.getTestdatafromExcel("Book1");
		return ob;
		}
	
	
	
	
	

}
