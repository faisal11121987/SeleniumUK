package Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_Explicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");
        
        driver.findElement(By.partialLinkText("Digital downloads")).click();
        
        List<WebElement> allAddCart=driver.findElements(By.xpath("//input[@value='Add to cart']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        for(WebElement addCart : allAddCart)
        {
        	addCart.click();
        	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//a[text()='shopping cart']"))));
        }

	}

}
