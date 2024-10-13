package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkoutpages {
	
	
WebDriver driver;
	
	public checkoutpages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "newOrder")  
    private WebElement neworder;
	
	
	@FindBy(className = "Button")  
    private WebElement buttonss;
	
	@FindBy(xpath = "//tr/th")  
    private WebElement checkoutone;
	
	@FindBy(xpath = "(//tr/th)[10]")  
    private WebElement checkouttwo;
	
	
	
	
	
	public boolean checkoutonedisplayed()
	{
		boolean resu = checkoutone.isDisplayed();
		return resu;
	}
	
	public String checkouttwodisplayed()
	{
	String text = checkouttwo.getText();
		return text;
	}
	public void neworderclick()
	{
		
		
		neworder.click();
	}
		
	public void buttonclick()
	{
		buttonss.click();
	}

}
