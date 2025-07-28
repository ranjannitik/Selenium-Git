package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

public class RadioButtonEaseMyTrip {

    WebDriver driver;

    @Test
    public void TestPopups() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Pop in Selenium\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com/");
        
        
       
        
        
        int radioBtnCount = driver.findElements(By.xpath("//input[@type='checkbox']")).size();

        System.out.println("Number Of Radio Buttons: " + radioBtnCount);

        
//       int rad=driver.findElements(By.id("chkArmy")).size();
//       System.out.println("Number Of Radio Buttons: " + rad);

        driver.quit();
    }
}
