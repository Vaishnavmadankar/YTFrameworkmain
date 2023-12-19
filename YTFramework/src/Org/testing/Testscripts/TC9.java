package Org.testing.Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC9
{
	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_119Version\\chromedriver-win64\\chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));  //this is implcit wait
		
		// IsDisplyed : this method applicable for all the elements.
       boolean b1=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).isDisplayed();
       System.out.println(b1); // true
	   System.out.println("LogIn Button displayed on Dashboard");
	   
	   //IsEnabled : this method check is button disable or not
	   
	   boolean b2=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).isEnabled();
	   System.out.println(b2); //true
	   System.out.println("LogIn Button displayed on Dashboard");
	   
	   // IsSelected : this method used for Checkbox,radiobutton and dropdown.
	   
	   
	   WebElement b3=driver.findElement(By.xpath("//a[@href='#']"));
	   b3.click();
	   boolean b4= driver.findElement(By.linkText("CRM for Any Business")).isSelected();
	   System.out.println(b4);// false
	   System.out.println("Successfully clicked on CRM Dropdown");
		
		
		
	}
	

}
