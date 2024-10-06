package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.junit.Assert;



public class Standalontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.linkText("Register Now!")).click();
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("gyufgttyytnnu");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("tyfty");
		driver.findElement(By.cssSelector("[name='repeatedPassword']")).sendKeys("uytrfyuytf");
		driver.findElement(By.cssSelector("[name='account.firstName']")).sendKeys("Sridevi");
		driver.findElement(By.cssSelector("[name='account.lastName']")).sendKeys("Kamaraj");
		driver.findElement(By.cssSelector("[name='account.email']")).sendKeys("sridevi0718@gmail.com");
		driver.findElement(By.cssSelector("[name='account.phone']")).sendKeys("9203436205");
		driver.findElement(By.cssSelector("[name='account.address1']")).sendKeys("702 Ouray");
		driver.findElement(By.cssSelector("[name='account.city']")).sendKeys("Aurora");
		driver.findElement(By.cssSelector("[name='account.state']")).sendKeys("C0");
		driver.findElement(By.cssSelector("[name='account.zip']")).sendKeys("80017");
		driver.findElement(By.cssSelector("[name='account.country']")).sendKeys("US");
		WebElement dropdown = driver.findElement(By.cssSelector("[name='account.favouriteCategoryId']")) ;
		Select sc = new Select(dropdown);
		sc.selectByValue("DOGS");
		driver.findElement(By.cssSelector("[name='account.listOption']")).click();
		driver.findElement(By.cssSelector("[name='account.bannerOption']")).click();
		driver.findElement(By.cssSelector("[name='newAccount']")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
		
		
		driver.findElement(By.linkText("K9-BD-01")).click();
		
		driver.findElement(By.xpath("//td[contains(text(),'Female')]/../td[5]/a[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).clear();
		
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("3");
		
		driver.findElement(By.name("updateCartQuantities")).click();
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.className("Button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0, 1000);");
		String price = driver.findElement(By.xpath("(//tr/th)[10]")).getText();

		String ep = "Total: $55.50";
		 Assert.assertEquals(ep, price);
		
		
		
		
		
	}

}