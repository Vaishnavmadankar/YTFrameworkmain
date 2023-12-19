package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shots 
{
	ChromeDriver driver;
	Properties pr;
	
	public Shots(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	
   public void shortschecks() 
   {
	 WebElement Shortsbutttonclick=driver.findElement(By.xpath(pr.getProperty("Shorts")));
	 Shortsbutttonclick.click();
   }
}
