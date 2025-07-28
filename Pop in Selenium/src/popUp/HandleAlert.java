package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.By.ByName;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert {

    WebDriver driver;

    @Test
    public void TestPopups() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Pop in Selenium\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");
        
        
       
    }
}
