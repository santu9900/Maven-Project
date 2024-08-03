package package1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("santosh");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
	System.out.println(links.size());	
		for(int i=0;i<links.size();i++)
		{
			links.get(i).click();
		}
		
		//System.out.println(links.findElements(By.tagName("a")).size());
		/* driver.findElement(By.xpath("//a[normalize-space()='Santosh']")).click();
		 Set<String> windid=driver.getWindowHandles();
		 System.out.println(windid);
		 List<String> win = new ArrayList(windid);
		 String parent=win.get(0);
		 String child=win.get(1);
		 driver.switchTo().window(child);
		 Thread.sleep(10000);
		 driver.switchTo().window(parent);*/
		 
		
	}

}
