package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class History 
{
	ChromeDriver driver;
	Properties pr;
  
	public History (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void Historychech() 
	{
		WebElement history=driver.findElement(By.xpath(pr.getProperty("History")));
		history.click();
	}
}