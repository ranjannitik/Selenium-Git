package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_ID {
	
	WebDriver driver;
	
	@Test
	public void  DemoTestID() throws Exception {
		driver =new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login?state=hKFo2SB5OVdfa2lRV0lvWWZhUjN5OXFWeTI2VnJrdVAxUkVOeqFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIDByYUMtakpvTHJWMklybkxwV0xXVzBKV0FTbjg4cV9ao2NpZNkgSmwzRWF2a010RDNpcjhLOTNSTlM4TldBVVFKcks4bnI");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ranjannitik0611@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Nitik@123");
		driver.findElement(By.xpath("//button[@name='action']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
