package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Submit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

//		WebElement searchTextField=driver.findElement(By.className("gLFyf"));
//		searchTextField.sendKeys("java");
//		searchTextField.submit();

		driver.findElement(By.className("LFyf")).sendKeys("Selenium",Keys.ENTER);

		

	}

 

}
