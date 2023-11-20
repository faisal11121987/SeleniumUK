package TestCasesTest;

import java.io.InterruptedIOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest1;

public class SelectJewelryTest extends BaseTest1 {

		
	@Test (groups = "Functional")
	public void ProductorderbyTestCase() throws InterruptedIOException, InterruptedException {
		

	driver.findElement(By.linkText("jewelry")).click();
	WebElement singleSelectDropdown=driver.findElement(By.id("products-orderby"));

	
	  WebElement dropdown=driver.findElement(By.id("products-orderby"));
    Select s=new Select(dropdown);
    
    for(int i = 0; i<6 ;i++); 
    
	s.selectByIndex('i');
    Thread.sleep(3000);
    dropdown=driver.findElement(By.id("products-orderby"));
    s=new Select(dropdown);
	}

}