package PopUpsHandling;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_navigate {

	public static void main(String[] args) throws MalformedURLException {
		
	    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://ebay.co.uk/");
        
        driver.findElement(By.xpath("//div[text()='Accept all']")).click();
        
      //driver.navigate().to("https://www.ebay.co.uk/");
        URL url = new URL("https://www.ebay.co.uk/");
        		
        		driver.navigate().to(url);
        

	}

}
