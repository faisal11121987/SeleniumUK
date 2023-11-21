package BrowserControlMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Navigation2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.get("https://www.ebay.co.uk/");
		
		System.out.println(driver.getTitle());
		
		//to navigate back
		driver.navigate().back();
		Thread.sleep(3000);
		
		//to navigate forward
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//to refresh page
		driver.navigate().refresh();
		
		driver.close();
	}

}
