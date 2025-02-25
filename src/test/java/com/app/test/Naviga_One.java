package com.app.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviga_One {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// get() it wait until page load
		driver.get("https://total-qa.com/checkbox-example/");
		// Navigation I -> refresh(), backward, forward, to
		driver.navigate().refresh();
		// to () it won't wait until page load
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		//backward
		driver.navigate().back();
		// forward
		driver.navigate().forward();
		
	}
}
