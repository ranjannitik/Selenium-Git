package Navigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		
		
		String Url =driver.getCurrentUrl();
		System.out.println(Url);
		
		
		driver.close();
		
	}

}
