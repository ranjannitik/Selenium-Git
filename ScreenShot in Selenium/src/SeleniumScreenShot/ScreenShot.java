package SeleniumScreenShot;

import java.io.File;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class ScreenShot {

    
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Pop in Selenium\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/campaign/landing.php");
    }

    @Test
    public void locatorsTestingBlog() throws Exception {
    	TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots/FacebookHomepage.png"));
		System.out.println("Captured ScreenShot");
        driver.quit();
    }
}
