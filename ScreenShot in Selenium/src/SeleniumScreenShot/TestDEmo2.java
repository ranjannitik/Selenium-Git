package SeleniumScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.Reusability;

public class TestDEmo2 {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Pop in Selenium\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://auth.hollandandbarrett.com/u/login");
    }

    @Test
    public void Browser() throws Exception {
        // Take screenshot after launching
        Reusability.capturedScreenShot(driver, "A. Launch Application - TakeScreenShot");

        // Wait for page to load
        Thread.sleep(2000);

        // Fill login form (actual ID values may vary, inspect the page to confirm)
        driver.findElement(By.name("email")).sendKeys("raghu.astepahead@gmail.com");
        driver.findElement(By.name("password")).sendKeys("raghuBN@123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Take screenshot after clicking login
        Reusability.capturedScreenShot(driver, "B. Click Sign In Button - TakeScreenShot");

        // Close browser
        driver.quit();
    }
}
