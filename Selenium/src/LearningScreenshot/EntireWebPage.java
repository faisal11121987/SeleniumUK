package LearningScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EntireWebPage {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.co.uk/");
		
		//To take the screenshot of entire web page
		TakesScreenshot ts = (TakesScreenshot)driver;
		//method to take the screenshot
		File src=ts.getScreenshotAs(OutputType.FILE);
		//path of the folder to store the screenshot
		File trg=new File("./Screenshot/amazon.png");
		//to copy from src to trg file type
		FileHandler.copy(src, trg);
		
		driver.close();

	}

}
