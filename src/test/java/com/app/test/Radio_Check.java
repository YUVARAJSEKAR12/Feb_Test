package com.app.test;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Check {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://total-qa.com/checkbox-example/");
		//driver.get("https://www.facebook.com/r.php");
		// xpath -> relative Xpath  it will starts with //
		// - //tagname[@attribute='value']
		//(//input[@name='chk'])[1]
		//
		//WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		//firstname.sendKeys("Aiite1");
		//driver.findElement(By.xpath("//input[@value='2']")).click();
		//driver.findElement(By.xpath("(//input[@name='chk'])[2]")).click();
		// title
		String title = driver.getTitle();
		System.out.println(title);
		//getCurrentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//close
		driver.close();
		//getPageSource
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		// Navigation I -> refresh(), backward, forward, to
		
		
		
	}
}
