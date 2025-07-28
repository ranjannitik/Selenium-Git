package ApachePoi;

import java.io.*;
import java.util.*;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class StatusCheck{

    String CsvPath = "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Apache PoI test\\CSVTestData.csv";
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Pop in Selenium\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
    }

    @Test
    public void locatorsTestingBlog() throws Exception {
        // Read all data from CSV
        CSVReader reader = new CSVReader(new FileReader(CsvPath));
        List<String[]> csvData = new ArrayList<>(reader.readAll());
        reader.close();

        // Modify in-memory data to add "Passed"
        for (int i = 1; i < csvData.size(); i++) {
            String[] row = csvData.get(i);

            String FName = row[0];
            String LName = row[1];
            String Email = row[2];
            String MNumb = row[3];
            String CName = row[4];

            // Fill form
            driver.findElement(By.name("FirstName")).sendKeys(FName);
            driver.findElement(By.name("LastName")).sendKeys(LName);
            driver.findElement(By.name("EmailID")).sendKeys(Email);
            driver.findElement(By.name("MobNo")).sendKeys(MNumb);
            driver.findElement(By.name("Company")).sendKeys(CName);

            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();

            // Add "Passed" in status column
            if (row.length < 6) {
                row = Arrays.copyOf(row, 6); // Expand array to fit Status
            }
            row[5] = "Passed";
            csvData.set(i, row);
        }

        // Write updated data back to CSV (overwrite)
        CSVWriter writer = new CSVWriter(new FileWriter(CsvPath));
        writer.writeAll(csvData);
        writer.close();

        driver.quit();
    }
}
