package Org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Org.testing.Base.Baselaunch;
import Org.testing.Pages.EmailPassword;
import Org.testing.Pages.History;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;
import Org.testing.Pages.NextButton;
import Org.testing.Pages.Subscriptions;
import Org.testing.Pages.homePageSignInbutton;

public class TC3 extends Baselaunch
{
	@Test
	public void TC3() throws InterruptedException 
	{
		homePageSignInbutton Signinbuttonclick=new homePageSignInbutton(driver, pr);
		Signinbuttonclick.signInclick();
		Thread.sleep(5000);
		LoginPage login=new LoginPage(driver, pr);
		login.signIn("Email");
		Thread.sleep(1000);
		NextButton nextbuttonclick=new NextButton(driver, pr);
		nextbuttonclick.buttonclick();
		Thread.sleep(2000);
		EmailPassword passwordenter=new EmailPassword(driver, pr);
		passwordenter.EmailPassword("PasswordField");
		Thread.sleep(1000);
		NextButton nextbuttonclick1=new NextButton(driver, pr);
		nextbuttonclick1.buttonclick();
		Thread.sleep(5000);
		
		Subscriptions subscriptionYT=new Subscriptions(driver, pr);
		subscriptionYT.subsriptionscheck();
		
		Thread.sleep(5000);
		LogoutPage Logout=new LogoutPage(driver, pr);
		Logout.Logout();
		Thread.sleep(2000);
		LogoutPage Signout=new LogoutPage(driver, pr);
		Signout.Signout();
		
	}
	
	
	
	
}
