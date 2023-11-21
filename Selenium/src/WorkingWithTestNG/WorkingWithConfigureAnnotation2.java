package WorkingWithTestNG;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkingWithConfigureAnnotation2 {

@BeforeClass
public void launchBrowser()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.demowebshop.tricentis.com/");
}
@BeforeMethod
public void performLogin()
{
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("rakesh1111@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("rakesh1111@gmail.com");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();	
}

@Test
public void testCase01 () throws InterruptedException
{
	System.out.println("TestCase 01");
	Thread.sleep(5000);
	{
	driver.findElement(By.linkText("Log out")).click();
	}
		 
@AfterClass
public void closeBrowser()
			{
	driver.close();
	}

}
