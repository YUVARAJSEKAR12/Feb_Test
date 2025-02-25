package com.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleTwo {
	public static WebDriver driver = null;
	public static void browserluanch(String browser) {
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/");
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("Yuvaraj");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("TRunkj654");
			WebElement element = driver.findElement(By.id("login"));
			element.click();
		}else if(browser.equals("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/");
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("Yuvaraj");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("TRunkj654");
			WebElement element = driver.findElement(By.id("login"));
			element.click();
		}
		
		
	}
	
	public static void main(String[] args) {
		browserluanch("Edge");
	}
}
