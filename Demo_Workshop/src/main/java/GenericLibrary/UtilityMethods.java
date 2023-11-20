package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityMethods {

	public static String getDataProperties(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}

	

	public static void getRandomNumber() {

		Random r = new Random();
		r.nextInt(1000);
	}
	public void waitUntilInvisibilityOfElement (WebDriver driver,WebElement element)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void takeScreenshoot(WebDriver driver,String name)
	{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg = new File("./Screenshot/"+name+".png");
	try {
		FileHandler.copy(src, trg);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}

}
