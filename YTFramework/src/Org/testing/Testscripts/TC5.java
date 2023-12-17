package Org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Org.testing.Base.Baselaunch;
import Org.testing.Pages.EmailPassword;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;
import Org.testing.Pages.NextButton;
import Org.testing.Pages.SubscribeYT;
import Org.testing.Pages.VideoPause;
import Org.testing.Pages.VideoPlay;
import Org.testing.Pages.homePageSignInbutton;

public class TC5 extends Baselaunch
{
	@Test
	public void TC5() throws InterruptedException 
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
		VideoPlay VideoYT=new VideoPlay(driver, pr);
		VideoYT.videoplays();
		Thread.sleep(5000);
		VideoPause Pausevideo=new VideoPause(driver, pr);
		Pausevideo.Stopvideo();
		Thread.sleep(3000);
		SubscribeYT subscripbe=new SubscribeYT(driver, pr);
		subscripbe.SubscribebuttonYT();
		Thread.sleep(3000);		
		LogoutPage Logout=new LogoutPage(driver, pr);
		Logout.Logout();
		
		LogoutPage Signout=new LogoutPage(driver, pr);
		Signout.Signout();
		
	}
	
	
	
}
