package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_clear {

	public static void main(String[] args) throws InterruptedException {

		//to launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("trainee");
		
		WebElement userNameTF=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userNameTF.sendKeys("admin");
		userNameTF.clear();
		userNameTF.sendKeys("trainee");
}
}