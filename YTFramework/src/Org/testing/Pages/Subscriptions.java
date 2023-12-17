package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subscriptions 
{
	ChromeDriver driver;
	Properties pr;
  
	public Subscriptions (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	
	public void subsriptionscheck() 
	{
		WebElement Subsription =driver.findElement(By.xpath(pr.getProperty("Subsriptions")));	
		  Subsription.click();
	}
}
