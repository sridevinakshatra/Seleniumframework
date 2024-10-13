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
import pages.homepage;
import pages.registerpage;
import utilities.utilities;

public class register extends base {
	
	public	WebDriver driver;
	registerpage re ;



@BeforeMethod
public void setup() throws IOException


{
	loadproperty();
	driver = launchapplication(p.getProperty("browser"));
	re = new registerpage(driver) ;
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
		
	
	
	re.registeraction();
	re.usernameaction(p.getProperty("newusername"));
	re.passwordaction(p.getProperty("newpassword"));
	re.againpasswordaction(p.getProperty("newpassword"));
	re.firstnameaction(pd.getProperty("firstname"));
	re.lastnameaction(pd.getProperty("lastName"));
	re.emailaction(pd.getProperty("email"));
	re.phoneaction(pd.getProperty("phone"));
	re.addressaction(pd.getProperty("address1"));
	re.cityaction(pd.getProperty("city"));
	re.stateaction(pd.getProperty("state"));
	re.zipaction(pd.getProperty("zip"));
	homepage hm =	re.countryaction(pd.getProperty("country"));
	
	hm.dropddownselect();
	hm.listoption();
	hm.banneroption();
	hm.newacc();
	Assert.assertTrue(re.signinpagedisplayed());
		/*driver.findElement(By.linkText("Register Now!")).click();
		driver.findElement(By.cssSelector("[name='username']")).sendKeys();
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
		sc.selectByValue("DOGS");*/
	
		
		
	}
	
	@Test(priority=2,dataProvider="datasupply")
	public void sign(String username,String password)
	{
		
	    re.usernameactionclear();
		re.usernameaction(username);
		re.passwordactionclear();
		re.passwordaction(password);
		re.signclick();
	
		/*driver.findElement(By.cssSelector("[name='username']")).clear();
		driver.findElement(By.cssSelector("[name='username']")).sendKeys(username);
		driver.findElement(By.cssSelector("[name='password']")).clear();
		driver.findElement(By.cssSelector("[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("[name='signon']")).click();*/
		Assert.assertTrue(re.signoutpagedisplayed());
	
	}
	
	@DataProvider(name="datasupply")
	public Object[][] supplydata() throws IOException
	{
	
		Object[][]  ob= utilities.getTestdatafromExcel("Sheet1");
		return ob;
		}
	
	
	
	
	

}
