package com.Launch.Url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.get("https://www.opencart.com");
		driver.get("https://www.bing.com");
		driver.get("https://freecrm.com/");
		driver.get("https://www.ebay.com/");
	}

}
