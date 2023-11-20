package TestCasesTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest1;


public class Assignment1RegisterTest extends BaseTest1 { 
	@Test (groups = "Functional")
	public void RegisterTestCase() {
		
		
		

		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Faisal");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Mohammed");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("faisal@hotmail.co.uk");
 
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("faisal@hotmail.co.uk");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("faisal@hotmail.co.uk");
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
	}
 
}