package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	ChromeDriver driver;
	Properties pr;
  
	public LoginPage (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void signIn(String username) throws InterruptedException 
	{
		
		WebElement user=driver.findElement(By.xpath(pr.getProperty("Email")));
		user.sendKeys("vipinpatil2511@gmail.com");
		
		
	}
	
	 
}
