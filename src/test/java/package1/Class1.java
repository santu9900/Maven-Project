package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Class1 {

	public static void main(String[] args) 
	{
		//ChromeDriver driver= new ChromeDriver();
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=kbmYMeoTg2Q");
		String act_title=driver.getTitle();
		System.out.println(act_title);
		if(act_title.equals("Session 21 - Selenium with Java | Introduction & Environment Setup| 2024 New series - YouTube"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	

	}

}