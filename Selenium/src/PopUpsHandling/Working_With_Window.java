package PopUpsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Window {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		System.out.println(driver.getTitle());
		//to fetch the session ID of main page
		String mainId=driver.getWindowHandle();
		
		System.out.println(mainId);
		
		driver.findElement(By.linkText("Facebook")).click();
		
		driver.findElement(By.linkText("Twitter")).click();
		//to fetch the session ID of all Tabs
		Set<String> allId=driver.getWindowHandles();
		
		System.out.println(allId);
		
	   for(String id : allId)
		{
		   driver.switchTo().window(id);
		   System.out.println(driver.getTitle());
		   Thread.sleep(3000);
		}
		   Thread.sleep(3000);
		   driver.quit();
		}
		
		
	}
