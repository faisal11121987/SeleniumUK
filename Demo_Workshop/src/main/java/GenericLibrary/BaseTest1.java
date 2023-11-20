package GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest1  {
	public WebDriver driver;
	public UtilityMethods um=new UtilityMethods();
	
	@BeforeClass 
	public void launchBrowser()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	}
		@BeforeMethod
		public void performLogin()
		{
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("faisal@hotmail.co.uk");
			driver.findElement(By.id("Password")).sendKeys("faisal@hotmail.co.uk");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
        @AfterMethod
        public void performLogout()
{
	    driver.findElement(By.linkText("Log out")).click();
}
    	@AfterClass
    	public void closeBrowser()
    	{
    		driver.close();
    	}
    }
