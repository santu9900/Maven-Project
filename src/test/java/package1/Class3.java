package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) 
	{
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String cururl=driver.getCurrentUrl();
		System.out.println(cururl);
		boolean icon=driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).isDisplayed();
		System.out.println(icon);
		driver.findElement(By.xpath("//input[@id='male']")).click();
		boolean select=driver.findElement(By.xpath("//input[@id='male']")).isSelected();
	System.out.println("radio button is selected   " + select);
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9900983208");
		

	}

}
