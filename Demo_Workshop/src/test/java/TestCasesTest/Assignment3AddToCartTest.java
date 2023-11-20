package TestCasesTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;


import GenericLibrary.BaseTest1;
public class Assignment3AddToCartTest extends BaseTest1 {
	@Test (groups = "Smoke")
	public void addToCart () throws InterruptedException {

		//Step 3 : To navigate to Digital downloads
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		if(driver.getTitle().equals("Demo Web Shop. Digital downloads"))
		{
			System.out.println("Digital downloads page is displayed");
		}
		else
			System.out.println("Digital downloads page is not displayed");
		//Step 4: Located all AddToCart buttons
		List<WebElement> allProducts=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//Step 5: To Add all the products to the cart
		for(WebElement product : allProducts )
		{
			product.click();	
			
			um.waitUntilInvisibilityOfElement(driver,driver.findElement(By.xpath("//a[text()='shopping cart']")));
			Thread.sleep(1000);
		}
		//Step 6: To navigate to shopping cart
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		if(driver.getTitle().equals("Demo Web Shop. Shopping Cart"))
		{
			Reporter.log("Shopping Cart page displayed",true);
		}
		else
			Reporter.log("Shopping cart page not displayed",true);
		List<WebElement> cartProducts=driver.findElements(By.xpath("//tr[@class='cart-item-row']"));
		
		//Step 7: Validate the number of products in shopping cart
		if(allProducts.size()==cartProducts.size())
		{
			Reporter.log("AddToCart Test Case Pass",true);
		}
        um.takeScreenshoot(driver, "AddToCartTestCase");
	}

}