package Assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Jewelry_Assignment {
	

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        
        driver.findElement(By.partialLinkText("jewelry")).click();
        
        WebElement dropdown=driver.findElement(By.id("products-orderby"));
        
        Select s=new Select(dropdown);
            
        for(int i = 0; i<6 ;i++); //options in the dropdown
          
        {
     
			s.selectByIndex('i');
            Thread.sleep(3000);
            dropdown=driver.findElement(By.id("products-orderby"));//re-initialise to avoid stale element reference exception
            s=new Select(dropdown);
        }
        
    }
}