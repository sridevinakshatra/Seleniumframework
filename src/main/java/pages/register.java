package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register {
	
	WebDriver driver;
	//driver.findElement(By.linkText("Register Now!")).click();
	/*driver.findElement(By.cssSelector("[name='username']")).sendKeys(p.getProperty("newusername"));
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
	driver.findElement(By.cssSelector("[name='account.country']")).sendKeys(pd.getProperty("country"));*/
	@FindBy(linkText = "Register Now!")
    private WebElement register;

    @FindBy(css = "[name='username']")  
    private WebElement username;

    @FindBy(css = "[name='password']")  
    private WebElement password;

    @FindBy(css = "[name='repeatedPassword']") 
    private WebElement repeatedPassword;

    @FindBy(css = "[name='account.firstName']")  
    private WebElement firstname;

    @FindBy(css = "[name='account.lastName']")  
    private WebElement lastname;

    @FindBy(css = "[name='account.email']") 
    private WebElement email;

    @FindBy(css = "[name='account.phone']") 
    private WebElement phone;

    @FindBy(css = "[name='account.address1']")  
    private WebElement address;

    @FindBy(css = "[name='account.city']")  
    private WebElement city;

    @FindBy(css = "[name='account.state']")  
    private WebElement state;

    @FindBy(css = "[name='account.zip']")
    private WebElement zip;

    @FindBy(css = "[name='account.country']")  
    private WebElement country;
	
	 public register(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); 
	    }
	
public void registeraction()
{
	register.click();
	  username.sendKeys(newUsername);
	  password.sendKeys(newPassword);
	  repeatedPassword.sendKeys(newPassword);
	   firstname.sendKeys(firstName);
	   lastname.sendKeys(lastName);
	   email.sendKeys(lastName);
	   phone.sendKeys(email);
	   address.sendKeys(email);
	   state.sendKeys(email);
	   zip.sendKeys(email);
	   country.sendKeys(email);
	   
}
	
	
	
	
	
	

}
