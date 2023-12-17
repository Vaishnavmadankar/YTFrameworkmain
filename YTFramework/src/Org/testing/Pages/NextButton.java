package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextButton 
{
	ChromeDriver driver;
	Properties pr;
  
	public NextButton (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void buttonclick() 
	{
		WebElement Nextbutton=driver.findElement(By.xpath(pr.getProperty("Next")));
		Nextbutton.click();
	}

}