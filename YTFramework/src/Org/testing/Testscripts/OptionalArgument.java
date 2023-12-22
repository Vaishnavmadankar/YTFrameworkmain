package Org.testing.Testscripts;

public class OptionalArgument 
{
   public void m1(Object...a) 
   {
	   if(a.length==0) 
	   {
		   System.out.println("this is default parameterized argument");
	   }
	   else 
	   {
		   System.out.println("this parameterized argument");
	   }
	   
   }
   
   public static void main(String[] args) {
	   OptionalArgument obj=new OptionalArgument();
	   obj.m1();
	   obj.m1("Vaishnav");
	   obj.m1("vaishnav", 25111996);
	   obj.m1(12211.12, 1221);
}
}
