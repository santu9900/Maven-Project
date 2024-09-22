package FrameworkTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import FrameworkPomClass.PomClass;

public class LoginTestNegetive extends BaseClass
{
	@Test
	public void LoginNegetive()
	{
		PomClass pm=new PomClass(driver);
		pm.Set_Username("admin");
		pm.Set_Password("admin");
		pm.Click();
		
		 String Errom_Msg = pm.Error_msg();
		 assertEquals(Errom_Msg, "Invalid credentials", "Error message validation failed");
		 System.out.println("Error message validation passed");
	}

}
