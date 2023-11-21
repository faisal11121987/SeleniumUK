package BrowserControlMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_quit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

				driver.get("file:///C:/Users/MohammedFaisal/Downloads/Multiple%20Windows.html");
				
				driver.findElement(By.xpath("//button[text()='Open Windows']")).click();

	
				driver.close();

//				driver.close();
	}

}
