package WebElementInterfaceMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_SingleSelectDropdown2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/MohammedFaisal/Downloads/demo.html");
			
			WebElement dropDown=driver.findElement(By.id("standard_cars"));
			
			Select s = new Select(dropDown);
			//to fetch all the options present in the dropdown
			List<WebElement> allOptions=s.getOptions();
			
			for(WebElement option :allOptions)
			{
				System.out.println(option.getText());
			}
			
			driver.close();

	}

}
