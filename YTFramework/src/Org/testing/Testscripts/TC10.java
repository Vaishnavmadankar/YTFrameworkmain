package Org.testing.Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

// Implicit and Explicit waits
public class TC10 
{

	
   public static void main(String[] args) 
   {
	   System.setProperty("Webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_119Version\\chromedriver-win64\\chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
        // this is implicit waits --- this is globally applied --this is available for all webelements
		
		//WebElement button=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		  //button.click();
		  
		 // WebElement firstname=driver.findElement(By.name("firstname"));
		  
		  //WebElement lastname=driver.findElement(By.name("lastname"));

//		  WebElement emailaddress=driver.findElement(By.name("reg_email__"));
		  
	//	  WebElement Reenteremailaddress=driver.findElement(By.name("reg_email_confirmation__"));
		  
		//  WebElement Newpassword=driver.findElement(By.name("reg_passwd__"));

		  
		 //sendkeys(driver,firstname,Duration.ofSeconds(20),"tom");      // this is explicit waits
	//	 sendkeys(driver,firstname,Duration.ofSeconds(10),"Harry");     // this is explicit waits
		 //sendkeys(driver,firstname,Duration.ofSeconds(30),"ABC@tcs.com");     // this is explicit waits
		// sendkeys(driver,firstname,Duration.ofSeconds(30),"ABC@tcs.com");        // this is explicit waits
		 //sendkeys(driver,firstname,Duration.ofSeconds(30),"Pass@1234");           // this is explicit waits
		 
		 
		 WebElement forgatepassword=driver.findElement(By.linkText("Forgotten password?"));
		 clickOn(driver,forgatepassword,Duration.ofSeconds(5));                                // this is explicit waits

   }
   
   public static void sendkeys(WebDriver driver, WebElement element, Duration i,String value) 
   {
	   Wait w=new WebDriverWait(driver, i);
	   w.until(ExpectedConditions.visibilityOf(element));
	   element.click();
	   
   }
  
   
   public static void clickOn(WebDriver driver, WebElement element, Duration i) 
   {
	   Wait w=new WebDriverWait(driver, i);
	   w.until(ExpectedConditions.elementToBeClickable(element));
	   element.click();
	   
   }
   

     


}
