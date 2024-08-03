package package1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List <WebElement> options=driver.findElements(By.xpath("//select[@id='colors']"));
		for(WebElement opt :options)
		{
			if(opt.equals("Red") || opt.equals("White"))
			System.out.println(opt.getText());
		}

	}

}
