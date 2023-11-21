package WorkingWithTestNG;

import org.testng.annotations.Test;

public class WorkingWithMultipleAnnotation {
	@Test (priority=1)
	public void register()
	{
	 System.out.println("Registration successfull");
	}
	@Test (priority=2)
	public void login()
	{
	 System.out.println("Login successfull");
	}
	@Test (priority=3)
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
