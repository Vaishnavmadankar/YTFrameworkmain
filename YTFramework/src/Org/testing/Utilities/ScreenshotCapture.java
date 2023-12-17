package Org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture 
{
   public static void takescreenshot(ChromeDriver driver,String filepath) throws IOException 
   {
	   File F=driver.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(F, new File(filepath));
   }
}
