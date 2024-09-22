package FrameworkTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import FrameworkPomClass.PomClass;

public class LoginTest extends BaseClass
{
	
	@Test
	public void Login()
	{
	  
		PomClass pm=new PomClass(driver);
		pm.Set_Username("Admin");
		
		pm.Set_Password("admin123");
		
		pm.Click();
		
		String title = driver.getTitle();
	   assertEquals(title, "OrangeHRM", "Title validation failed");
	   System.out.println("Title validation passed");
	   
	   String CurrentUrl= driver.getCurrentUrl();
	   assertEquals(CurrentUrl, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", "Current Url Validation failed");
	   System.out.println("Current Url Validation passed");
	}

	}

