package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");

		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\MohammedFais_xad7v\\OneDrive - Sciforma\\SeleniumDay12.pdf)");
	}

}
