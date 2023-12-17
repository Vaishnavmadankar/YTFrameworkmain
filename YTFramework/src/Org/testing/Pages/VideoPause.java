package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPause 
{
	
	ChromeDriver driver;
	Properties pr;
  
	public VideoPause (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}

	public void Stopvideo() 
	{
		WebElement Videostops=driver.findElement(By.xpath(pr.getProperty("Pausevideo")));
		Videostops.click();
	}
	
}
