package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_iframe2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		//to change the driver focus by using int index
		//driver.switchTo().frame(0);
		
		
		WebElement frameWebElement=driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
		//to change the driver focus by using Web element
		driver.switchTo().frame(frameWebElement);
		
		String message=driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		System.out.println(message);
		//to switch the driver focus back to parent frame
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span.[text()='Edit']='Edit']")).click();
	}
}