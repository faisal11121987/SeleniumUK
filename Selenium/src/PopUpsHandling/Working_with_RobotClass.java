package PopUpsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_RobotClass {

	public static void main(String[] args) throws AWTException {
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        
        driver.findElement(By.xpath("//Div[text()='Accept all']")).click();
        
        driver.findElement(By.id("APjFqb")).click();
        
        Robot r = new Robot ();
        
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);
        
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        
        r.keyPress(KeyEvent.VK_L);
        r.keyRelease(KeyEvent.VK_L);
        
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        
        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_N);
        
        r.keyPress(KeyEvent.VK_I);
        r.keyRelease(KeyEvent.VK_I);
        
        r.keyPress(KeyEvent.VK_U);
        r.keyRelease(KeyEvent.VK_U);
        
        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_M);

	}

}
