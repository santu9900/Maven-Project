package VerifyUrlWithAssertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageTitle 
{
	WebDriver driver;
	@BeforeClass
	void Login()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}

	@Test(priority = 1)
	void PageTitle() 
	{
		String ExpecedTitle="OrangeHRM";
		assertEquals(driver.getTitle(), ExpecedTitle, "Title validation failed");
		System.out.println("Title Validation passed");
	}
	 
	@Test(priority = 2)
	void Logo() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		assertTrue(logo.isDisplayed(), "Logo validation failed");
		System.out.println("Logo validation passed");
	}
	
	@Test(priority = 3)
	void Username()
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		assertTrue(username.isDisplayed(), "Username is not present");
		System.out.println("Username presence validation passed");
	}
	
	@Test(priority = 4)
	void UserNamePlaceholder()
	{
		 String Expected="Username";
		WebElement placeholder=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		assertEquals(placeholder.getAttribute("placeholder"), Expected , "Placeholder text is invalid");
		System.out.println("Placeholder text is valid");
			
	}
	
	@Test(priority = 5)
	void UsernameLength()
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		String input="Admin";
		username.sendKeys(input);
		assertTrue((input.length()<=5), "Username length validation failed");
		System.out.println("Username length validation passed");
		
	}
	
	@Test(priority = 6)
	void UsernameIcon()
	{
		WebElement icon=driver.findElement(By.xpath("//i[@class='oxd-icon bi-person oxd-input-group__label-icon']"));
		assertTrue(icon.isDisplayed(), "Username Icon validation failed");
		System.out.println("Username Icon validation passed");
	}
	
	@Test(priority = 7)
	void Screenshot()
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\file01.png");
		screenshot.renameTo(targetfile);
	}
	
	@Test(priority = 8)
	void LogoScreenshot()
	{
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
	    File logoSc=logo.getScreenshotAs(OutputType.FILE);
	    File taretfile=new File(System.getProperty("user.dir")+"\\Screenshots\\filelogo.png");
	    logoSc.renameTo(taretfile);
	}

	

}
