package PopUpsHandling;

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

	public class Working_with_Notifications {
		 
		public static void main(String[] args) throws AWTException, InterruptedException {
		
	//	ChromeOptions opt=new ChromeOptions();
	//	opt.addArguments("--disable-notifications");
		 
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.easemytrip.com/");
			Thread.sleep(3000);
			
			Robot r = new Robot();
			
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
	}
	}