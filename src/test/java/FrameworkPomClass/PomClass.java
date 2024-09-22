package FrameworkPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomClass extends BasePageforPom
{
	
	public PomClass(WebDriver driver)
	{
		
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement User_Name;
	
	@FindBy(xpath = "//label[normalize-space()='Username']")
	WebElement UserName_Textfield_Name;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement UserName_Placeholder_Name;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement UserName_TextField_ErrMsg;
	
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//label[normalize-space()='Password']")
	WebElement Password_Textfield_Name;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password_Placeholder_Name;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement Password_TextField_ErrMsg;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Click;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement Errmsg;
	
	@FindBy(xpath = "//img[@alt='company-branding']")
	WebElement Logo;
	
	
	
	public void Set_Username(String username)
	{
		User_Name.sendKeys(username);
	}
	
	public String Verify_Username_TextfieldName()
	{
		try {
			return (UserName_Textfield_Name.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
			
		}
	}
	
	public String Verify_Username_PlaceholderName()
	{
		String UserPlaceholder = UserName_Placeholder_Name.getAttribute("placeholder");
		return UserPlaceholder;
		
		/*try {
			return (UserName_Placeholder_Name.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
			
		}*/
	}
	
	public String UserName_ErrMsg()
	{
	    try {
				return (UserName_TextField_ErrMsg.getText());
			}
			catch(Exception e)
			{
				return(e.getMessage());
				
			}
	}
	
	public void Set_Password(String password)
	{
		Password.sendKeys(password);
	}
	
	public String Verify_Password_TextfieldName()
	{
		try {
			return (Password_Textfield_Name.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
			
		}
	}
	
	public String Verify_Password_PlaceholderName()
	{
		String passwordPlaceholder = Password_Placeholder_Name.getAttribute("placeholder");
		return passwordPlaceholder;
		
		/*try {
			return (Password_Placeholder_Name.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
			
		}*/
		
	}
	
	public String Password_ErrMsg()
	{
	    try {
				return (Password_TextField_ErrMsg.getText());
			}
			catch(Exception e)
			{
				return(e.getMessage());
				
			}
	    }
	
	public void Click()
	{
		Click.click();
	}
	
	public String Error_msg()
	{
		try {
			return (Errmsg.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
			
		}
	}
	
	public boolean LogoDisplay()
	{
		boolean logoo = Logo.isDisplayed();
		return logoo;
	}
	
}
