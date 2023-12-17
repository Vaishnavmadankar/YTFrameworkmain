package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommentsYT 
{
	ChromeDriver driver;
	Properties pr;
  
	public CommentsYT (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void Comments(String comment) throws InterruptedException 
	{
		WebElement Commentonvideo=driver.findElement(By.xpath(pr.getProperty("Commentonvideo")));
		Thread.sleep(2000);
		Commentonvideo.sendKeys("Nice");
	}
	
}
