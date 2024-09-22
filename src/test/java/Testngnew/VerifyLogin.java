package Testngnew;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyLogin 
{
	WebDriver driver;
	//Verify Url text
	@Test(priority = 1)
	@Parameters({"browser"})
	void LaunchUrl(String br)
	{
		switch (br) 
		{
		case "Chrome" : driver=new ChromeDriver(); break;
		case "Edge" : driver=new EdgeDriver(); break;
		case "Firefox" : driver=new FirefoxDriver(); break;			
			
		default: System.out.println("Invalid Browser");
			return;
		}
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String ActualUrl=driver.getCurrentUrl();
		
		if(ActualUrl.equals(ExpectedUrl))
		{
			System.out.println("Url validation pass");
		}
		else
		{
			System.out.println("Url validation pass");
		}
		
	}
	
	//Verify Page Title name
	@Test(priority = 2)
    void PageTitlename()
    {
    	String ActualPageTitle=driver.getTitle();
    	String ExpectedTitle="OrangeHRM";
    	if(ActualPageTitle.equals(ExpectedTitle));
    	{
    		System.out.println("Page Title Validation pass");
    	}
    }
	
	// Presence of user name text field
	@Test(priority = 3)
	void UsernamePresence()
	{
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		if(user.isDisplayed())
		{
			System.out.println("Username presence validation pass");
		}
		else
		{
			System.out.println("Username presence validation fail");
		}
	}
	
	 // Presence of password text field
	@Test(priority = 4)
	void passwordPresence()
	{
		WebElement user=driver.findElement(By.xpath("//input[@name='password']"));
		if(user.isDisplayed())
		{
			System.out.println("Password textfield presence validation pass");
		}
		else
		{
			System.out.println("Username textfield validation fail");
		}
	}


}
