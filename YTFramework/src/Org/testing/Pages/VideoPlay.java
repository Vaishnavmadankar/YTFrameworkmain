package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay 
{
	ChromeDriver driver;
	Properties pr;
  
	public VideoPlay (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void videoplays() 
	{
		WebElement videoplay=driver.findElement(By.xpath(pr.getProperty("videoplay")));
		videoplay.click();
		
	}

	
}
