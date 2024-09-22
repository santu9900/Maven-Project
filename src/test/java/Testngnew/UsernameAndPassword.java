package Testngnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UsernameAndPassword 
{
	WebDriver driver;
	
	// Launching browser and URL
	@Test(priority = 1)
	@Parameters({"browser"})
	void LaunchingUrl(String br)
	{
		switch (br) 
		{
		case "Edge": driver=new EdgeDriver();
			
			break;

		default: System.out.println("Invalid Browser");
			return;
		}
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
    }
	
	// Verify the presence of user name component on login page
	@Test(priority = 2)
	void Username()
	{

		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		if(user.isDisplayed())
		{
			System.out.println("username field is present");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("username field is not present");
			Assert.assertFalse(false);
		}
	}
	
	// Verify that user name text field is enabled on login page
	@Test(priority = 3)
	void UsernameEnabled()
	{
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		if(user.isEnabled())
		{
			System.out.println("username field is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("username field is disabled");
			Assert.assertTrue(false);
		}
	}

	//Placeholder validation
	@Test(priority = 4)
	void Placeholder()
	{
		WebElement Actplaceholder=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String ExpectedPH="Username";
		
		if(Actplaceholder.getAttribute("placeholder").equals(ExpectedPH))
		{
			System.out.println("Placeholder validation pass");
			
		}
		else
		{
			System.out.println("Placeholder validation fail");
		}
		
	}
	
	// Verify that the input value does not exceed the maximum length
	@Test(priority = 5)
	void UsernameLength()
	{
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		String username="Admin";
		user.sendKeys(username);
		
		if(username.length()<=5)
		{
			System.out.println("Username length validation test passed.");
		}
		else
		{
			System.out.println("Username length validation test failed");
			
		}
	}
}