package LearningJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_scrollintoView {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		WebElement news=driver.findElement(By.xpath("//small[@class= 'text-white']"));
 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].scrollIntoView(false);",allrights);
		TakesScreenshot ts = (TakesScreenshot) driver;
		 
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/selenium.png");
		
		FileHandler.copy(src, trg);
		
		driver.close();
			
	}
 
}