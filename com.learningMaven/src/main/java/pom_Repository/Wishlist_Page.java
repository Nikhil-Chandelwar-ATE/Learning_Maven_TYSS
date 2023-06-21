package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Wishlist_Page {

	SoftAssert ast = new SoftAssert();
	
	public Wishlist_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[1]/input[@name='removefromcart']")
	private WebElement removeCheckBox;
	
	public void clickRemoveCheckBox() {
		removeCheckBox.click();
	}

	public WebElement getRemoveCheckBox() {
		return removeCheckBox;
	}

	public void setRemoveCheckBox(WebElement removeCheckBox) {
		this.removeCheckBox = removeCheckBox;
	}
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[2]/input[@name='addtocart']")
	private WebElement addToCartCheckBox;
	
	public void clickAddToCartCheckBox() {
		addToCartCheckBox.click();
	}

	public WebElement getAddToCartCheckBox() {
		return addToCartCheckBox;
	}

	public void setAddToCartCheckBox(WebElement addToCartCheckBox) {
		this.addToCartCheckBox = addToCartCheckBox;
	}
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[4]/a")
	private WebElement productName;

	public void productNameVerification(String userproductName) {
		ast.assertEquals(productName.getText(), userproductName);
		ast.assertAll();
	}
	
	public WebElement getProductName() {
		return productName;
	}

	public void setProductName(WebElement productName) {
		this.productName = productName;
	}
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[5]/span[@class='product-unit-price']")
	private WebElement productPrice;
	
	public void productPriceVerification(String userPrice) {
		ast.assertEquals(productPrice.getText(), userPrice);
		ast.assertAll();
	}
	
	public WebElement getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(WebElement productPrice) {
		this.productPrice = productPrice;
	}
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[6]/input[@class='qty-input']")
	private WebElement productQuantity;
	
	public void productQuantityverification(String userProductQuantity) {
		ast.assertEquals(productQuantity.getText(), userProductQuantity);
		ast.assertAll();
	}
	
	public WebElement getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(WebElement productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[7]/span[@class='product-subtotal']")
	private WebElement totalPrice;
	
	public void totalPriceVerification(String userprice) {
		ast.assertEquals(totalPrice.getText(), userprice);
		ast.assertAll();
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(WebElement totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateWishlistButton;
	
	public void clickUpdateShoppingCartButton() {
		updateWishlistButton.click();
	}

	public WebElement getUpdateWishlistButton() {
		return updateWishlistButton;
	}

	public void setUpdateWishlistButton(WebElement updateWishlistButton) {
		this.updateWishlistButton = updateWishlistButton;
	}
	
	@FindBy(xpath = "//input[@name='addtocartbutton']")
	private WebElement addToCartButton;
	
	public void clickAddToCartButton() {
		addToCartButton.click();
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}
	
	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement emailAFriendButton;
	
	public void clickEmailAFriendButton() {
		emailAFriendButton.click();
	}

	public WebElement getEmailAFriendButton() {
		return emailAFriendButton;
	}

	public void setEmailAFriendButton(WebElement emailAFriendButton) {
		this.emailAFriendButton = emailAFriendButton;
	}
	
	@FindBy(xpath = "//span[@class='share-label']/../..//a[@class='share-link']")
	private WebElement wishlistURL;
	
	public String getWishlistURLText() {
		return wishlistURL.getText();
	}

	public WebElement getWishlistURL() {
		return wishlistURL;
	}

	public void setWishlistURL(WebElement wishlistURL) {
		this.wishlistURL = wishlistURL;
	}
}
