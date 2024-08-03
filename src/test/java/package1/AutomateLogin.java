
package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomateLogin
{
    
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String exptUrl=driver.getCurrentUrl();
		if(actUrl.equals(exptUrl))
		{
			System.out.println("The entered URL is valid");
		}
		else
		{
			System.out.println("The entered URL is invalid");
		}
	
		String Title=driver.getTitle();
		String title="OrangeHRM";
		if(Title.equals(title))
		{
			System.out.println("Displayed title is valid");
		}
		else
		{
			System.out.println("Displayed title is invalid");
		}
		
		String username="Admin";
		String password="admin123";
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Dashboard should be displayed");
		//if(username.equals("admin") && password.equals("admin121"));
		
		//System.out.println("warning mesg should be displayed");
		boolean warningmesg=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).isDisplayed();
		System.out.println("Warning mesg displayed : "+ warningmesg);
		
		String actext="Invalid credentials";
		String wartext=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		if(wartext.equals("Invalid credentials"))
		{
			System.out.println("Warning text is valid");
		}
		else
		{
			System.out.println("Warning text is invalid");
		}
	}
}

		
		
		/*if(username.equals("admin") && password.equals("admin121"));
		{
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println("Dashboard should be displayed");
		}
	
		{
			//System.out.println("warning mesg should be displayed");
		}


	}*/


