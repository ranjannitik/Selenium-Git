package locatorsDemo;

import java.util.List;

import java.security.AllPermission;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CountAttribute {
	
	WebDriver driver;
	
	@Test
	public void  DemoTestID() throws Exception {
		System.setProperty("webdriver.edge.driver","C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Selenium Edge Browser Launch\\EdgeBrowserJars\\msedgedriver.exe" );
		driver =new EdgeDriver();
		
		driver.get("https://www.hollandandbarrett.com/");
		
		List<WebElement>allList=driver.findElements(By.tagName("a"));
		System.out.println(allList.size());
		
		
		for(WebElement el:allList) {
			System.out.println(el.isDisplayed());
			System.out.println(el.isEnabled());
			System.out.println(el.getAttribute("href"));
		}
		
		
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		WebElement element=allList.get(3);
		element.click();

	}
	

}
