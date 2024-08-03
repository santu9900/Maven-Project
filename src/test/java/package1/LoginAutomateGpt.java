package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomateGpt 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		driver.getCurrentUrl();
		if(driver.getCurrentUrl().equals(ExpectedUrl));{
			System.out.println("Login Successful and home page is displayed");
		}else
		{
			System.out.println("Login Unsuccessful and warning mesg displayed");
		}
	}}




