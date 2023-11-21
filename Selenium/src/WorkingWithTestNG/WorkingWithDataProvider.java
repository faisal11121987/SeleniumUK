package WorkingWithTestNG;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class WorkingWithDataProvider {
	
	@Test
	public void testCase() throws InterruptedException {
		
		//step 1 :Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//Step 2: perform login
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("faisal@hotmail.co.uk");
		driver.findElement(By.id("Password")).sendKeys("faisal@hotmail.co.uk");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(4000);
		driver.close();
	}
	
	@DataProvider (name="dataSupply")
	public Object dataSupply()
	{
		Object [][] arr=new Object [3][2];
		arr[0][0]="admin@gmail.com";
		arr[0][1]="password";
		arr[1][0]="admin1@gmail.com";
        arr[1][1]="password1";
    	arr[2][0]="admin2@gmail.com";
        arr[2][1]="password2";
        return arr;

}
}
