package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.instagram.com/");
        //Thread.sleep(3000);1 - 2 seconds
        driver.findElement(By.name("username")).sendKeys("Rakesh");
        driver.findElement(By.name("password")).sendKeys("Rakesh@123");
}
}