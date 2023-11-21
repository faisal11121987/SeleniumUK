package WebElementInterfaceMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_FindElement3 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.findElement(By.linkText("Log in")).click();


				driver.findElement(By.id("Email")).sendKeys("rakesh1111@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("rakesh1111@gmail.com");
				driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

				driver.findElement(By.partialLinkText("Books")).click();
				
	//	List<WebElement>allProductName = driver.findElement(By.xpath("//h2[@class='product-title']//a"));
     List<WebElement>allProductPrice = driver.findElements(By.xpath("//div[@class='prices']"));

 
	for(WebElement productName : allProductName)
	{
		System.out.println(productName.getText());
	}
				for(WebElement productPrice : allProductPrice) {

					List<WebElement>allProductPrice1 = driver.findElements(By.xpath("//span[@class='price actual-price']"));
				}
				driver.close();

			} 
		}
		