package com.qa.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatortag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		// wherever out attribute value is not unique, then go for findElements & get
		
		driver.findElements(By.tagName("input")).get(2).sendKeys("data");
		
		

	}

}
