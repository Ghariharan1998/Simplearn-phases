package com.qa.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		// store the location of the element in an object of type WebElement
		
	WebElement	e1 = driver.findElement(By.id("searchInput"));
	
	     e1.isDisplayed();
	     e1.isEnabled();
	     e1.sendKeys("Automation testing");
	     Thread.sleep(3000);
	// Name locator
	     
	 WebElement e2 =  driver.findElement(By.name("search")) ;  
	     
	 e2.clear();
	 e2.sendKeys("New data for automation");
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
			
			

	}

}
