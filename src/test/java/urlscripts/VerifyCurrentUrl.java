package urlscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCurrentUrl {

	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String ExpectedUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String ActualUrl=driver.getCurrentUrl();
	
		if(ExpectedUrl.equals(ActualUrl));
		{
			System.out.println("URL verification passed");
		}
	    else
		{
		  System.out.println("URL verification failed");
		}
			
		}

	}

}
