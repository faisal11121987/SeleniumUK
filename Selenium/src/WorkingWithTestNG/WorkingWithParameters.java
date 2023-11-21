package WorkingWithTestNG;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class WorkingWithParameters {
	
	@Test
	public void testCase() {
		
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		//perform login
		driver.findElement(By.id("Email")).sendKeys("faisal@hotmail.co.uk");
		driver.findElement(By.id("Password")).sendKeys("faisal@hotmail.co.uk");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
 
}
