package ApachePoi;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DDTCaseStudy {

    String CsvPath = "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Apache PoI test\\CSVTestData.csv";
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Pop in Selenium\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
    }

    @Test
    public void locatorsTestingBlog() throws Exception {
        
    }
}
