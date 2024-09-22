package POM;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginClass 
{
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	void testLogin() 
	{
	   pomClass2 pm=new pomClass2(driver);
	   pm.setUsername("Admin");
	   pm.password("admin123");
	   pm.login();
	  
	   
	   assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", "URL validation failed");
	   System.out.println("URL validation passed");
	   driver.navigate().back();
	}
	
	@Test
	void testUsername()
	{
		 pomClass2 pm=new pomClass2(driver);
		   pm.setUsername("Admi");
		   pm.password("admin123");
		   pm.login(); 
		   
		   
	}
	
	@AfterClass
	void close() 
	{

		driver.close();
	}

}
