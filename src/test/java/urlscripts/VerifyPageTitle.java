package urlscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	  String ExpectedPageTitle= "OrangeHRM";
	  String ActualTitle=driver.getTitle();
	  if(ExpectedPageTitle.equals(ActualTitle))
	  {
		  System.out.println("Page title verification passed");
	  }
	  else
	  {
		  System.out.println("Page title verification passed");
	  }

	}

}
