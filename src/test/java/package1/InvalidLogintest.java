package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogintest {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin121");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement errmesg=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		
		if(errmesg.isDisplayed())
		{
			System.out.println("Invalid login successful");
		}
		else
		{
			System.out.println("Invalid login unsuccessful");
		}
		// TODO Auto-generated method stub

	}

}
