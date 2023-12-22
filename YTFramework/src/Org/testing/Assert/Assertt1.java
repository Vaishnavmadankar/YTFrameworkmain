package Org.testing.Assert;

public class Assertt1 
{
   public static void assertt1(String expected,String actual) 
   {
	   if (expected.equals(actual)) 
	   {
		System.out.println("Assertion is getting passed");
       }
	   else 
	   {
		   System.out.println("Assertion is getting failed");   
	   }
	   
   }
}
