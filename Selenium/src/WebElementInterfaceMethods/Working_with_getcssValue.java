package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_getcssValue {

		public static void main(String[] args) throws InterruptedException {

			//to launch the browser
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager123");
			
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			WebElement errmessage=driver.findElement(By.xpath("//span[contains(text(),'Username')]"));
			
			String color=errmessage.getCssValue("color");
			System.out.println("color : "+color);
			
			String font=errmessage.getCssValue("font");
			System.out.println("font : "+font);
			
			System.out.println(errmessage.getText());
			
			driver.close();
			
			
			
			
		}
}
