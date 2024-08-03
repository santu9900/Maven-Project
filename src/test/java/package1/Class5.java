package package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class5 {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 WebElement options=driver.findElement(By.xpath("//select[@id='country']"));
		Select sel= new Select(options);
		/* sel.selectByVisibleText("France");
		 sel.selectByValue("india");
		 sel.selectByIndex(4);
		// TODO Auto-generated method stub*/
		List<WebElement> opt=sel.getOptions();
		for(WebElement opts:opt)
		{
		System.out.println(opts.getText());
		}

	}

}
