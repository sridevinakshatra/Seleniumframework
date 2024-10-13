package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homepage {
	WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "[name='account.favouriteCategoryId']")  
    private WebElement favcategory;
	
	@FindBy(css = "[name='account.listOption']")  
    private WebElement listoptions;
	
	@FindBy(css = "[name='account.bannerOption']")  
    private WebElement banneroptions;
	
	@FindBy(css = "[name='newAccount']")  
    private WebElement newaccounts;
	
	
	
	
	public void dropddownselect()
	{
		Select s = new Select(favcategory);
		s.selectByValue("DOGS");
	}
	
	public void listoption()
	{
		listoptions.click();
	}
	
	public void banneroption()
	{
		banneroptions.click();
	}
	
	public void newacc()
	{
		newaccounts.click();
	}
	
	

	
}
