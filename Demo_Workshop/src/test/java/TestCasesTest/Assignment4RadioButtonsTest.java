package TestCasesTest;

	import java.io.InterruptedIOException;
import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest1;
public class Assignment4RadioButtonsTest {

		public class Assignment2Dropdown extends BaseTest1 {

			
			@Test (groups = "System")
			public void ProductorderbyTestCase() throws InterruptedIOException, InterruptedException {
			
			List<WebElement>allRadioButtons=driver.findElements(By.xpath("//li[@class='answer']//label"));
			
			for(WebElement radioButton :allRadioButtons )
			{
				radioButton.click();
				Thread.sleep(3000);
				System.out.println(radioButton.getText());
			}
}
}
	}