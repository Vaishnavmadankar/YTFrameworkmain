package Org.testing.Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion 
{
	SoftAssert s1=new SoftAssert ();   // This is soft assertion 
	
    @Test   
	public void testcase() 
	{
		System.out.println("Entred UserName");
		System.out.println("Entred password");
		Assert.assertEquals(true, true);            // this is Hard Assertion if we mark True, false this Expected = Actual it means failed and code not execute further
		
		System.out.println("Click on Login button");
		Assert.assertEquals(true, true);              // this is Hard Assertion
	
		System.out.println("Amazon Home page");
		s1.assertEquals(true,false,"code was failed this line 22");       // This is soft assertion 
		
		
		System.out.println("User able to add items in cart tray");
		s1.assertEquals(true,false,"code was failed this line 26");        // This is soft assertion 
	
		System.out.println("user able to buy product from Amazon");
		s1.assertEquals(true,false,"code was failed this line 29");        // This is soft assertion 
	
	
	    s1.assertAll();                                         // this showing which assertion failed but code not terminated means where issue we are facing 
	}
    
    
	
}
