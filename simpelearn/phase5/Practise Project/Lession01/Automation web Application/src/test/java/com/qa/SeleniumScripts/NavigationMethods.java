package com.qa.SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.wikipedia.org/");
		
		String expctedtitle= "Wikipedia123";
		
		String actualtitle = driver.getTitle(); // will fetch the title of the page
		
		if(expctedtitle.equals(actualtitle))
		{
			System.out.println("title of the page is correct");
		}
		else {
			System.out.println("title of the page is not correct");
		}
	
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
String title1 = driver.getTitle(); // will fetch the title of the page
		
		System.out.println("Title of Page2 =" + title1);
		
		driver.navigate().back(); // navigates back to previous url
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
