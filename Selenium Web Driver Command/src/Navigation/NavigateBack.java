package Navigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		
		
		String Url =driver.getCurrentUrl();
		System.out.println(Url);
		
		
		driver.navigate().back();
		Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		
		driver.get("https://www.google.com/");
		Url=driver.getCurrentUrl();
		System.out.println(Url);
		
	}

}
