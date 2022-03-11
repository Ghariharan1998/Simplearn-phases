package com.qa.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Testing");
		
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		
		// click on the link
		
	WebElement li=	driver.findElement(By.linkText("Current events"));

	li.isDisplayed();
	li.isEnabled();
	li.click();
	
	
	driver.findElement(By.partialLinkText("Log")).click();
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
