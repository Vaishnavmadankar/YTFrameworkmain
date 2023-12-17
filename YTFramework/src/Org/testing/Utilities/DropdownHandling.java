package Org.testing.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


//We dont use this utilities in our project 
public class DropdownHandling 
{

	public static void dropdownSelectionByIndex(int Index,WebElement dropdown) 
	{
		Select s=new Select(dropdown);
		s.selectByIndex(Index);
		
	}
	
	public static void dropdownSelectionByValue(String Value,WebElement dropdown) 
	{
		Select s=new Select(dropdown);
		s.selectByValue(Value);
		
	}
	
	public static void dropdownSelectionByVisible(String visibletext,WebElement dropdown) 
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(visibletext);
		
	}
	
}
