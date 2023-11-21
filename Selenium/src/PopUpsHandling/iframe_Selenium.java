package PopUpsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_Selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		//OK cookies 
		driver.findElement(By.xpath("//a[text()='Ok']")).click();
		
		//to change the driver focus by using int index
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//a[text()='Free Mock Tests'])[2]")).click();
		
		Set<String>allId=driver.getWindowHandles();
		
		for(String id : allId)
		{
			
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(3000);
		
	}
}
}
		
		