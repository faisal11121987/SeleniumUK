package WorkingWithTestNG;

import org.testng.annotations.Test;

public class WorkingWithDependsOnMethod {
	
	@Test 
	public void register()
	{
	 System.out.println("Registration successfull");
	}
	@Test (dependsOnMethods = "register")
	public void login()
	{
	 System.out.println("Login successfull");
	}
	@Test (enabled=false)
	public void addToCart()
	{
	 System.out.println("product added to cart");
	}
	@Test (priority=4)
	public void placeorder()
	{
	 System.out.println("order placed");
	}

}
