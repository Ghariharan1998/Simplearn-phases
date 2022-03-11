package com.qa.SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUpcheck {
	
	public static void main(String [] args) throws InterruptedException
	{
		// WebDriver
		
		// can open a chrome browser window
		
		WebDriver driver = new  ChromeDriver();
		
		// Maxamize the browser window
		
		driver.manage().window().maximize();
		
		// Open a webpage-URL on the browser
		
		driver.get("https://www.wikipedia.org/");
		
	
		
		// do some testing
		
		//Close the browser window
		
		Thread.sleep(2000); // add wait time before closing the window
		
		driver.close(); // will close that particular browser window
		
		
	
		
	}

}
