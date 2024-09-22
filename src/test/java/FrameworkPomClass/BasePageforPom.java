package FrameworkPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageforPom {
	
	public WebDriver driver;

	public BasePageforPom(WebDriver driver)
	{
        	this.driver=driver;	
        	PageFactory.initElements(driver, this);
	}


}
