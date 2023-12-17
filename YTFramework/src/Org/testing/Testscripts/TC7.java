package Org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Org.testing.Base.Baselaunch;
import Org.testing.Pages.CommentsYT;
import Org.testing.Pages.EmailPassword;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;
import Org.testing.Pages.NextButton;
import Org.testing.Pages.VideoPlay;
import Org.testing.Pages.WatchLater;
import Org.testing.Pages.homePageSignInbutton;

public class TC7 extends Baselaunch
{

	@Test
	public void TC7() throws InterruptedException 
	{
		homePageSignInbutton Signinbuttonclick=new homePageSignInbutton(driver, pr);
		Signinbuttonclick.signInclick();
		Thread.sleep(2000);
		LoginPage login=new LoginPage(driver, pr);
		login.signIn("Email");
		Thread.sleep(1000);
		NextButton nextbuttonclick=new NextButton(driver, pr);
		nextbuttonclick.buttonclick();
		Thread.sleep(2000);
		EmailPassword passwordenter=new EmailPassword(driver, pr);
		passwordenter.EmailPassword("PasswordField");
		Thread.sleep(2000);
		NextButton nextbuttonclick1=new NextButton(driver, pr);
		nextbuttonclick1.buttonclick();
		Thread.sleep(3000);
		WatchLater watchlatercheck=new WatchLater(driver,pr);
		watchlatercheck.watchlater();
		Thread.sleep(3000);
		LogoutPage Logout=new LogoutPage(driver, pr);
		Logout.Logout();
		Thread.sleep(2000);
		LogoutPage Signout=new LogoutPage(driver, pr);
		Signout.Signout();
		
	}
	
	
	
}
