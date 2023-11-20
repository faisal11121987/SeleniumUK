package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText= "Register")
	private WebElement registerLink;
	
	@FindBy(linkText= "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishListLink;
	
	@FindBy(partialLinkText="//span[text()='Digital downloads']")
	private WebElement disgitalDownloadLink;
	
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getDisgitalDownloadLink() {
		return disgitalDownloadLink;
	}
	
	

}
