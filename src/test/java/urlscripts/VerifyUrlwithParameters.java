package urlscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlwithParameters {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String baseUrl="https://opensource-demo.orangehrmlive.com";
		String parameter="/web/index.php/dashboard/index";
		String ExpectedUrl= baseUrl+parameter;
		
		String ActualUrl=driver.getCurrentUrl();
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Url with parameter verification passed");
		}
		else
		{
			System.out.println("Url with parameter verification failed");
		}

	}

}
