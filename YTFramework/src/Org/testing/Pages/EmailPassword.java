package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailPassword 
{
	ChromeDriver driver;
	Properties pr;
	
	public EmailPassword(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void EmailPassword(String Password) 
	{
		
		WebElement pass=driver.findElement(By.xpath(pr.getProperty("PasswordField")));
		pass.sendKeys("Vipin@185");
	}

}
