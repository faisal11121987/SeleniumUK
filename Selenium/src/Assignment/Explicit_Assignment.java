package Assignment;

import java.time.Duration;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Explicit_Assignment {
		
	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id='button00']")).click();
		
		driver.findElement(By.xpath("//button[@id='button01']")).click();
		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@id='buttonmessage']"))));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Two']")));
		
//		driver.findElement(By.xpath("//button[@id='button02']")).click();
		driver.findElement(By.xpath("//button[text()='Two']")).click();
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button03")));
		FluentWait fluentWait= new FluentWait(driver);
		fluentWait.pollingEvery(Duration.ofSeconds(1));
		fluentWait.withTimeout(Duration.ofSeconds(10));
		fluentWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button03"))));
		
		driver.findElement(By.xpath("//button[@id='button03']")).click();
		
		String message=driver.findElement(By.id("buttonmessage")).getText();
		
		System.out.println(message);
		
		driver.close();
	}

}
 
 