package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_iframe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		//to change the driver focus by using int index
		//driver.switchTo().frame(0);
		
		//to change the driver focus by using id value
		//driver.switchTo().frame("mce_O_ifr");
		
		WebElement frameWebElement=driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
		//to change the driver focus by using Web element
		driver.switchTo().frame(frameWebElement);
		
		String message=driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		System.out.println(message);
				
		driver.close();

}
}
