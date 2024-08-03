package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) 
	{
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=common/home");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
			System.out.println(links);
		

		
		
	}

	}

