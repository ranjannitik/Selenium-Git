package com.EdgeBrowser.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Selenium Edge Browser Launch\\EdgeBrowserJars\\msedgedriver.exe" );
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();

		
	}

}
