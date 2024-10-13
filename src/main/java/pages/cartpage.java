package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {
	
WebDriver driver;
	
	public cartpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[2]/img")  
    private WebElement quicklinks;
	
	@FindBy(linkText = "K9-BD-01")  
    private WebElement breeds;
	
	@FindBy(xpath = "//td[contains(text(),'Female')]/../td[5]/a[text()='Add to Cart']")  
    private WebElement addtocart;
	
	@FindBy(xpath = "(//*[@type='text'])[2]")  
    private WebElement value;
	
	@FindBy(name = "updateCartQuantities")  
    private WebElement updatequantitycart;
	
	@FindBy(linkText = "Proceed to Checkout")  
    private WebElement proceedtocheckout;
	
	
	@FindBy(xpath = "//div/h2")  
    private WebElement cartonedisplayed;
	
	@FindBy(xpath = "(//tr/th)[1]")  
    private WebElement carttwodisplayed;
	
//Assert.assertTrue(driver.findElement(By.xpath("(//tr/th)[1]")).isDisplayed());	
	
//Assert.assertTrue(driver.findElement(By.xpath("//div/h2")).isDisplayed());	
	
	
	public boolean cartoneresult()
	{
		boolean re = cartonedisplayed.isDisplayed();
		return re ;
	}
	
	public boolean carttworesult()
	{
		boolean res = carttwodisplayed.isDisplayed();
		return res;
	}
	
public void quicklinksclick()
{
	quicklinks.click();
}

public void breedclick()
{
	breeds.click();
}

public void addtocartclick()
{
	addtocart.click();
}

public void valueclear()
{
	value.clear();
}

public void valueenter()
{
	value.sendKeys("3");
}

public void updatequantityclick()
{
	updatequantitycart.click();
}

public checkoutpages checkoutclick()
{
	proceedtocheckout.click();
	return new checkoutpages(driver);
}


	
	
	
	
	
	
	 
	/*driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
		
		
		driver.findElement(By.linkText("K9-BD-01")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Female')]/../td[5]/a[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).clear();
		
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("3");
		
		driver.findElement(By.name("updateCartQuantities")).click();
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.className("Button")).click();*/

}
