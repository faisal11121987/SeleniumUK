package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class WorkingWithPropertiesFile {
 
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\MohammedFais_xad7v\\Documents\\Selenium\\TestData.properties");
		Properties pobj = new Properties();//create object of properties class
		pobj.load(fis);//stored data will be loaded into the pobj
		//to fetch the URL
		String value1=pobj.getProperty("url");
		System.out.println(value1);
		//to fetch the Username
		String value2=pobj.getProperty("un");
		System.out.println(value2);
		//to fetch the Password
		String value3=pobj.getProperty("pwd");
		System.out.println(value3);
 
}
}