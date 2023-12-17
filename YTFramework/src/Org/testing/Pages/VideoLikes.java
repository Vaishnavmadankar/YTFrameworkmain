package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoLikes 
{
	ChromeDriver driver;
	Properties pr;
  
	public VideoLikes (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}

	
	public void Videolikes() 
	{
		WebElement videolike=driver.findElement(By.xpath(pr.getProperty("Like")));
		videolike.click();
	}
	
}