package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePageSignInbutton 
{

	ChromeDriver driver;
	Properties pr;
	
	public homePageSignInbutton(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void signInclick() 
	{
		WebElement SignInbutton=driver.findElement(By.xpath(pr.getProperty("homePageSignInbutton")));
		SignInbutton.click();
	}
}
