package WebElementInterfaceMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
	   driver.get("file:///C:/Users/MohammedFaisal/Downloads/demo.html");
					
		WebElement dropDown=driver.findElement(By.id("multiple_cars"));
		//to select the options from dropdown
		Select s = new Select(dropDown);
		Thread.sleep(3000);
		s.selectByIndex(1);
		s.selectByValue("min");
		Thread.sleep(3000);
		s.selectByVisibleText("Ford");
		//to deselect the options from the drop down
		
		//s.deselectByIndex(1);
		s.deselectAll();
		
		List<WebElement>allOptions=s.getOptions();
		//To fetch all the options present in the dropdown
		for(WebElement option :allOptions)
		{
			System.out.println(option.getText());
			Thread.sleep(2000);
			option.click();
		}
        System.out.println("Multi-Select : "+s.isMultiple());
        driver.close();
	}

}
