package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Livecheck 
{
	ChromeDriver driver;
	Properties pr;
  
	public Livecheck (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}

	
	public void LiveVideo() throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement Live=driver.findElement(By.xpath(pr.getProperty("Live")));
		Live.click();
	}
}
