package PopUpsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Window2 {


		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			
			driver.findElement(By.linkText("Facebook")).click();
			driver.findElement(By.linkText("Twitter")).click();
			driver.findElement(By.linkText("YouTube")).click();
			driver.findElement(By.linkText("Google+")).click();
			
			
			Set<String> allId=driver.getWindowHandles();
			
			for(String id : allId)
			{
				   driver.switchTo().window(id);
	               System.out.println(driver.getTitle());
	               
			if(!driver.getTitle().equals("NopCommerce | Facebook"))
		
				driver.close();
					 
	}
}
}