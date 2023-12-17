package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{
	ChromeDriver driver;
	Properties pr;
	
	public HomePage(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	
   public void Trending() 
   {
	 WebElement trending=driver.findElement(By.xpath(pr.getProperty("Trending")));
	 trending.click();
   }
}
