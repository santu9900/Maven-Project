package FrameworkTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import FrameworkPomClass.PomClass;

public class UserName_Password_TestCases extends BaseClass
{
	@Test(priority = 1)
	public void UserName()
	{
		PomClass pm=new PomClass(driver);
		String UserField_Name = pm.Verify_Username_TextfieldName();
		assertEquals(UserField_Name, "Username", "Username_Textfield_name validation failed");
		System.out.println("Username_Textfield_name validation passed");
		
		String Username_placeholder = pm.Verify_Username_PlaceholderName();
		assertEquals(Username_placeholder, "Username", "Username_placeholder validation failed" );
		System.out.println("Username_placeholder validayion passed");
	}
	
	@Test(priority = 2)
	public void Password()
	{
		PomClass pm=new PomClass(driver);
		String Password_Name = pm.Verify_Password_TextfieldName();
		assertEquals(Password_Name, "Password", "Password_Textfield_name validation failed");
		System.out.println("Password_Textfield_name validation passed");
		
		String Password_placeholder = pm.Verify_Password_PlaceholderName();
		assertEquals(Password_placeholder, "Password", "Password_placeholder validation failed" );
		System.out.println("Password_placeholder validation passed");
	}
	
	@Test(priority = 3)
	public void Logo() throws InterruptedException
	{
		PomClass pm= new PomClass(driver);
		Thread.sleep(3000);
		boolean logo = pm.LogoDisplay();
		assertEquals(logo, true, "Logo validation failed");
		System.out.println("Logo validation passed");
		
	}
	
	@Test(priority = 4)
	public void LoginEmptyUsername()
	{
		PomClass pm= new PomClass(driver);
		pm.Set_Username("");
		pm.Set_Password("admin@123");
		pm.Click();
		String userErr = pm.UserName_ErrMsg();
		assertEquals(userErr, "Required", "UserName Textfield error mesg validation failed");
		System.out.println("UserName Textfield error mesg validation passed");
	}

}
