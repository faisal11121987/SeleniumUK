package BrowserControlMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

 

public class NavigatingtoUrl {

 

	public static void main(String[] args) throws InterruptedException {

 

		//To launch the browser

		WebDriver driver = new ChromeDriver();

		

		//To navigate to any URL

		driver.get("https://www.google.com");
		
		//To Maxmise the browser window
		driver.manage().window().maximize();
		
		//to fetch the title
		String title=driver.getTitle();
		System.out.println(title);
		
		//to fetch the Url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		
		//To close the browser
		driver.close();

	}

 

}
