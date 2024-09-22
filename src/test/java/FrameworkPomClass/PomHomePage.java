package FrameworkPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomHomePage extends BasePageforPom
{
	public PomHomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement Search;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	WebElement Leave;
	
	
	
	public void Search_Entry(String searchInput)
	{
		Search.sendKeys(searchInput);
	}
	
	public boolean Search_Entry_display()
	{
		boolean leavedisplay = Leave.isDisplayed();
		return leavedisplay;
	}

	
}
