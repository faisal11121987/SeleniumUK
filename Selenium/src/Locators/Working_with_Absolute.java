package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Absolute {


	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/MohammedFaisal/Downloads/RegistrationPage.html");
			
			driver.findElement (By.xpath("//html/body/input[1]")).sendKeys("UserName");
	}
}
