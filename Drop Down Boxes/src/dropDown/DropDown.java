package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
    
    WebDriver driver;
    
    @Test
    public void DemoTestID() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Selenium Edge Browser Launch\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();
        
        driver.get("https://www.facebook.com/campaign/landing.php?\"");
        WebElement monthElement=driver.findElement(By.id("month"));
        Select monthD=new Select(monthElement);
        monthD.selectByIndex(8);
        Thread.sleep(2000);
        
        
        monthD.selectByValue("10");
        Thread.sleep(2000);
        
        
        monthD.selectByVisibleText("Dec");
        Thread.sleep(3000);
        
    }
}
