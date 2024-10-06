package testcase;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basetest.base;

public class cart extends base {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException


	{
		
		loadproperty();
		driver = launchapplication(p.getProperty("browser"));
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@Test(priority=1)
	public void productlistpage()
	{
		
		driver.findElement(By.cssSelector("[name='username']")).clear();
		driver.findElement(By.cssSelector("[name='username']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.cssSelector("[name='password']")).clear();
		driver.findElement(By.cssSelector("[name='password']")).sendKeys(p.getProperty("password"));
		driver.findElement(By.cssSelector("[name='signon']")).click();
             driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
		
		
		driver.findElement(By.linkText("K9-BD-01")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div/h2")).isDisplayed());
	
	}
	@Test(priority=2)
	public void productcart()
	{
		
		driver.findElement(By.cssSelector("[name='username']")).clear();
		driver.findElement(By.cssSelector("[name='username']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.cssSelector("[name='password']")).clear();
		driver.findElement(By.cssSelector("[name='password']")).sendKeys(p.getProperty("password"));
		driver.findElement(By.cssSelector("[name='signon']")).click();
             driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
		
		
		driver.findElement(By.linkText("K9-BD-01")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Female')]/../td[5]/a[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).clear();
		
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("3");
		
		driver.findElement(By.name("updateCartQuantities")).click();
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//tr/th")).isDisplayed());
		
		
	}
	

}
