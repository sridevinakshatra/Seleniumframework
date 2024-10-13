package testcase;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import pages.cartpage;
import pages.checkoutpages;
import pages.registerpage;

public class checkout extends base {
	public	WebDriver driver;
	registerpage re  ;
	cartpage cp;
	checkoutpages chp;
	
	@BeforeMethod
	public void setup() throws IOException


	{
		
		loadproperty();
		driver = launchapplication(p.getProperty("browser"));
		re = new registerpage(driver) ;
	
	}

@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
		
	@Test(priority=1)
	public void checkoutpage()
	{

	    re.usernameactionclear();
		  re.usernameactionclear();
			re.usernameaction(p.getProperty("newusername"));
			re.passwordactionclear();
			re.passwordaction(p.getProperty("newpassword"));
		cp =	re.signclick();
		

		cp.quicklinksclick();
		cp.breedclick();
		cp.addtocartclick();
		cp.valueclear();
		cp.valueenter();
		cp.updatequantityclick();
	chp =	cp.checkoutclick();
		
		
	
		chp.neworderclick();
		chp.buttonclick();
		
		Assert.assertTrue(chp.checkoutonedisplayed());
		
		/*driver.findElement(By.cssSelector("[name='username']")).clear();
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
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.className("Button")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//tr/th")).isDisplayed());*/
		
	}
	@Test(priority=2)
	public void payment()
	{
	
		/*driver.findElement(By.cssSelector("[name='username']")).clear();
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
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.className("Button")).click();*/

	   re.usernameactionclear();
		  re.usernameactionclear();
			re.usernameaction(p.getProperty("newusername"));
			re.passwordactionclear();
			re.passwordaction(p.getProperty("newpassword"));
			 cp = re.signclick();
		
		
		cp.quicklinksclick();
		cp.breedclick();
		cp.addtocartclick();
		cp.valueclear();
		cp.valueenter();
		cp.updatequantityclick();
		chp = cp.checkoutclick();
		
		
		
		chp.neworderclick();
		chp.buttonclick();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0, 1000);");
		String price = chp.checkouttwodisplayed();

		String ep = "Total: $55.50";
		 Assert.assertEquals(ep, price);
		
	}
	}



	
