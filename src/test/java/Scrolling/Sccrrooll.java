package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sccrrooll {

	public static void main(String[] args) 
	{
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in/");
		
			for(int i=0;i>-1;i++)
			{
              JavascriptExecutor js= (JavascriptExecutor) driver;
              js.executeScript("window.scrollBy(0,300)");
              
			}

	}

}
