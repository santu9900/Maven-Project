package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		// TODO Auto-generated method stub //table[@name='BookTable']//th
		int clms=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(clms);
	}

}
