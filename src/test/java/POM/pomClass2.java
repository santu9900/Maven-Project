package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomClass2 
{
	WebDriver driver;
	pomClass2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement user;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement click;
	
	public void setUsername(String Username)
	{
		user.sendKeys(Username);
	}
	
	public void password(String passwords)
	{
		pass.sendKeys(passwords);
	}
	
	public void login()
	{
	    click.click();
	}
}
