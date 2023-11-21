package BrowserControlMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_navigation {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//to fetch is used to fetch the source code of WebPage
		// String pageSource=driver.getPageSource();
		// System.out.println(pageSource);
		
		//System.out.println(driver.getPageSource());
		
		
		//to fetch the height and width of the browser
		Dimension size = driver.manage().window().getSize();
		System.out.println("Size : "+size);
		
		//To fetch the position of the browser (X and y coordinates)
		Point position = driver.manage().window().getPosition();
		System.out.println("Position: "+position);
	}
	
}
