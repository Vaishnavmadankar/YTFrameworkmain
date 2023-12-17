package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WatchLater 
{
	ChromeDriver driver;
	Properties pr;
  
	public WatchLater (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}

	
	public void watchlater() 
	{
		WebElement watchlater=driver.findElement(By.xpath(pr.getProperty("WatchLater")));
		watchlater.click();
		
	}
	
}
