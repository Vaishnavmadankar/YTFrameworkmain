package Org.testing.Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Org.testing.Base.Baselaunch;
import Org.testing.Pages.EmailPassword;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;
import Org.testing.Pages.NextButton;
import Org.testing.Pages.Subscriptions;
import Org.testing.Pages.VideoLikes;
import Org.testing.Pages.VideoPlay;
import Org.testing.Pages.homePageSignInbutton;

public class TC4 extends Baselaunch
{
	@Test
	public void TC4() throws InterruptedException 
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
		//Wait w=new WebDriverWait(driver,Duration.ofSeconds(1000));
		VideoPlay VideoYT=new VideoPlay(driver, pr);
		//w.until(ExpectedConditions.elementToBeClickable("videoplay"));
		Actions Ac=new Actions(driver);
		Ac.keyDown(Keys.DOWN).click().perform();
		VideoLikes Likes=new VideoLikes(driver, pr);
		Likes.Videolikes();
		Thread.sleep(3000);
		LogoutPage Logout=new LogoutPage(driver, pr);
		Logout.Logout();
		LogoutPage Signout=new LogoutPage(driver, pr);
		Signout.Signout();
		Thread.sleep(3000);
	}
	
	
	
}
