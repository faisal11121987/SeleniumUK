package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
//      for password text field
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		
		WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));

		checkBox.click();
//      to verify checkbox is selected or not
//		System.out.println(checkBox.isSelected());
		if(checkBox.isSelected())
		{	
		System.out.println("CheckBox is selected");
	    }
		else
		System.out.println("CheckBox is NOT selected");

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='logout']")).click();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("actiTIME-Login"));
		{
		System.out.println("TestCase Passed");
}
		else
			System.out.println("TestCase Failed");
		}
		driver.close();	
	}
	}