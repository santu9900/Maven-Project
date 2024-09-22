package urlscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyCurrentUrl {

	@Test
	void CurrentUrl() 
	{

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String ExpectedUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
	
		if(driver.getCurrentUrl().equals(ExpectedUrl))
		{
			System.out.println("URL verification passed");
		}
	    else
		{
		  System.out.println("URL verification failed");
		}
			
		}

	}

