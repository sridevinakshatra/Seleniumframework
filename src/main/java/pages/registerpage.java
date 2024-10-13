package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {
	
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
    
    @FindBy(css = "[name='signon']")  
    private WebElement signin;
    
    
    @FindBy(xpath = "(//img)[19]")  
    private WebElement signinpage;
    
    
    @FindBy(linkText = "Sign Out")  
    private WebElement signout;
    
    
    
    
    //Assert.assertTrue(driver.findElement(By.xpath("(//img)[19]")).isDisplayed());
	
	 public registerpage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); 
	    }
	 
	 
	 public boolean signinpagedisplayed()
	 {
		boolean resultin = signinpage.isDisplayed();
		 return resultin;
	 }
	 

	 public boolean signoutpagedisplayed()
	 {
		boolean resultout = signout.isDisplayed();
		 return resultout;
	 }
	 
	 
	
public void registeraction()
{
	register.click();
	 
	 
	   
}

public void usernameaction(String name)
{
	 username.sendKeys(name);
	
}

public void usernameactionclear()
{
	 username.clear();
	
}

public void passwordactionclear()
{
	password.clear();
	
}
public void passwordaction(String ps)
{
	password.sendKeys(ps);
}
public void againpasswordaction (String againpassword)
{
	repeatedPassword.sendKeys( againpassword);
}
public void firstnameaction(String fs)
{
	firstname.sendKeys(fs);
}
public void lastnameaction(String ln)
{
	lastname.sendKeys(ln);
}
public void emailaction(String em)
{
	email.sendKeys(em);
}
public void phoneaction(String ph)
{
	phone.sendKeys(ph);
}
public void addressaction(String add)
{
	address.sendKeys(add);
}
public void cityaction(String ct)
{
	 city.sendKeys(ct);
}
public void stateaction(String st)
{
	 state.sendKeys(st);
}
public void zipaction(String zp)
{
	 zip.sendKeys(zp);
}
public homepage countryaction(String co)
{
	 country.sendKeys(co);
	 return new homepage(driver);
}

public cartpage signclick()
{
	signin.click();
	return new cartpage(driver);
}


	
	
	
	
	
	

}
