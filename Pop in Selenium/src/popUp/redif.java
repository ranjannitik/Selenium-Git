package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class redif {

    WebDriver driver;

    @Test
    public void TestPopups() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Pop in Selenium\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//button[@name='proceed']")).click();
        Alert alert=driver.switchTo().alert();
        String txtString=alert.getText();
        System.out.println(txtString);
        if (txtString.equals("Please enter a valid user name")) {
            System.out.println("Correct alert message");
        } else {
            System.out.println("Incorrect alert message");
        }
        alert.accept();
        driver.quit();

//       
    }
}
