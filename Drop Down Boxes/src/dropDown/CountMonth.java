
package dropDown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CountMonth {

    WebDriver driver;

    @Test
    public void DemoTestID() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Selenium Edge Browser Launch\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();

        driver.get("https://www.facebook.com/campaign/landing.php");
        WebElement monthElement = driver.findElement(By.id("month"));

        Select monthD = new Select(monthElement);
        List<WebElement> options = monthD.getOptions();
        int monthSize=options.size();
        System.out.println("Total month is :"+monthSize);
        
       

        for (WebElement option : options) {
            String month = option.getText();
            System.out.println("Months Names :"+month);
            
        }

       
        driver.quit();
    }
}
