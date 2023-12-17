package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage 
{
	ChromeDriver driver;
	Properties pr;
	
	public LogoutPage (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	
	public void Logout() throws InterruptedException 
	{
		
		WebElement logout=driver.findElement(By.xpath(pr.getProperty("logout")));
		logout.click();
		
	}
	
	public void Signout() throws InterruptedException 
	{

		WebElement Signout=driver.findElement(By.xpath(pr.getProperty("Signout")));
		Signout.click();
		
	}

}
