package Org.testing.Testscripts;

public class UpcastingandDowncastingB extends UpcastingandDowncastingA
{
    public void m2() 
    {
	 System.out.println("I am Class B"); 
    }
    
    public static void main(String[] args) 
    {
    	UpcastingandDowncastingA obj=new UpcastingandDowncastingB(); // Upcasting Example
    	obj.m1();
    	
    	UpcastingandDowncastingB obj1=(UpcastingandDowncastingB)obj;  // Downcasting Example
    	obj1.m2();
    	obj1.m1();
    	
	}
}
