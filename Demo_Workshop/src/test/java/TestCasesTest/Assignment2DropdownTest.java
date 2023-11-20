package TestCasesTest;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest1;

public class Assignment2DropdownTest extends BaseTest1 {

		
	@Test (groups = "Smoke")
	public void ProductorderbyTestCase() throws InterruptedIOException {
		
		


	

			driver.findElement(By.linkText("Apparel & Shoes")).click();
			WebElement singleSelectDropdown=driver.findElement(By.id("products-orderby"));

	}

}
