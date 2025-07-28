package com.Learn.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		String Url=driver.getCurrentUrl();
		System.out.print(Url);
		
		driver.quit();

	}

}
