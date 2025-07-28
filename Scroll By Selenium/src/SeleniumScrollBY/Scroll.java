package SeleniumScrollBY;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scroll {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Pop in Selenium\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        
    }

    

    @Test
    public void Test() throws Exception {
        ChromeDriver driver = new ChromeDriver(); // or use: this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        // Scroll down by 1200 pixels
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");

        // Wait for 6 seconds
        Thread.sleep(6000);

        // Scroll up by 1400 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1400)");
    }
}
