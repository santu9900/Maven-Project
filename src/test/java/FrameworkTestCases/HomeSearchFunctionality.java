package FrameworkTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import FrameworkPomClass.PomClass;
import FrameworkPomClass.PomHomePage;

public class HomeSearchFunctionality extends BaseClass
{
	@Test(priority = 1)
	public void Login()
	{
		PomClass pm=new PomClass(driver);
		pm.Set_Username("Admin");
		
		pm.Set_Password("admin123");
		
		pm.Click();
	}
		
	@Test(priority = 2, dependsOnMethods = "Login")
	public void SearchFunctionality() throws InterruptedException
	{
		PomHomePage pm= new PomHomePage(driver);
		Thread.sleep(5000);
		pm.Search_Entry("leave");
		Thread.sleep(5000);
		boolean display = pm.Search_Entry_display();
		assertEquals(display, true, "Search entry validation failed");
		System.out.println("Search entry validation passed");

}
}