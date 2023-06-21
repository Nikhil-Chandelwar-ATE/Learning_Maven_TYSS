package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewelry_Selected_Product_page {

	public Jewelry_Selected_Product_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "add-to-wishlist-button-14")
	WebElement addToWishlistButton;
	
	public void clickAddToWishlistButton()
	{
		addToWishlistButton.click();
	}

	public WebElement getAddToWishlistButton() {
		return addToWishlistButton;
	}

	public void setAddToWishlistButton(WebElement addToWishlistButton) {
		this.addToWishlistButton = addToWishlistButton;
	}
	

}
