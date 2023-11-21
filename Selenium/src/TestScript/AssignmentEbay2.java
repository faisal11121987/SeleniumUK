package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentEbay2 {

		public static void main(String[] args) {
			
			//Test Data
			String expTitle="Ebay";
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ebay.co.uk/");
			
			if(driver.getTitle().equals(expTitle))
			{
				System.out.println("Test Case is PASS");
			}
			else
				System.out.println("Test Case is Fail");
			
			driver.close();

		}

	}