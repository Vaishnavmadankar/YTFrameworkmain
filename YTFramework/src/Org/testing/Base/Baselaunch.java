package Org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baselaunch 
{
    public ChromeDriver driver;
    public Properties pr;
	
    @BeforeClass
	public void browserlaunch() throws IOException 
	{
		File f=new File("../YTFramework/ObjectRepo.properties");
		FileInputStream Fr=new FileInputStream(f);
		pr= new Properties();
		pr.load(Fr);
		
		ChromeOptions  options=new ChromeOptions();
		options.addArguments("--incognito");
	
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_119Version\\chromedriver-win64\\chromedriver.exe");	
		driver=new ChromeDriver(options);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	
	}
	
	@AfterClass
	public void browserclose () throws InterruptedException 
	{
	Thread.sleep(2000);	
	driver.close();
	 
	}
}