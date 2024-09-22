package FrameworkTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkPomClass.PomClass;

public class LoginBoundaryTest extends BaseClass
{
	@DataProvider(name = "loginTestData")
    public Object[][] loginTestData() {
        return new Object[][]{
            {"Admi", "admin123", false},  // Username below minimum length
            {"Admin", "admin123", true},  // Username at minimum length
           // {"Admina", "admin123", false}, // Username just above minimum length
         /*   {"Admin", "admin12", false}, // Username below maximum length
            {"Admin", "admin123", true},  // Username at maximum length
            {"Admin", "admin1234", false}, // Username above maximum length
          */
        };
    }
	
	@Test(dataProvider = "loginTestData")
	public void LoginBoundary(String username, String password, boolean isvalid)
	{
		PomClass pm=new PomClass(driver);
		pm.Set_Username(username);
		pm.Set_Password(password);
		pm.Click();
		
			String title = driver.getCurrentUrl();
			assertEquals(title, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", "Title validation failed");
            System.out.println("Title validation passed");		
		
		
	}

}
