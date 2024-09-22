package POM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomClass 
{
	WebDriver driver;
	
      pomClass(WebDriver driver)
	{
    	  this.driver=driver;
		
	}
      
      By username=By.xpath("//input[@placeholder='Username']");
      By password=By.xpath("//input[@placeholder='Username']");
      By login=By.xpath("//input[@placeholder='Username']");
      
      public void setUserName(String user)
      {
    	  driver.findElement(username).sendKeys(user);
      }
	
      public void setPassword(String pass)
      {
    	  driver.findElement(password).sendKeys(pass);
      }
	
      public void loginbtn()
      {
    	  driver.findElement(login).click();
      }
	
	
}
