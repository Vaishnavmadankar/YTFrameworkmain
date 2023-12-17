package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscribeYT 
{
	ChromeDriver driver;
	Properties pr;
  
	public SubscribeYT (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
    
	
	public void SubscribebuttonYT() throws InterruptedException 
	{
		WebElement Subscribebutton=driver.findElement(By.xpath(pr.getProperty("Subscribebutton")));
		Subscribebutton.click();
		
		
	}
}
