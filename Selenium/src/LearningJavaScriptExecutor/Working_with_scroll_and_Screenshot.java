package LearningJavaScriptExecutor;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_scroll_and_Screenshot {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.selenium.dev/");
	
	WebElement allrights=driver.findElement(By.xpath("//small[@class()='text-white']"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguements[0].scrollIntoView(false);",allrights);

	TakesScreenshot ts = (TakesScreenshot)driver;
	//method to take the screenshot
	File src=ts.getScreenshotAs(OutputType.FILE);
	//path of the folder to store the screenshot
	File trg=new File("./Screenshot/selenium.png");

	
		

	}

}
