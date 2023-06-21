package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Shopping_Cart_Page {

	SoftAssert ast = new SoftAssert();
	
	public Shopping_Cart_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//Item remove check box
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
	
	//update cart button
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateShoppingCartButton;
	
	public void clickUpdateShoppingCartButton() {
		updateShoppingCartButton.click();
	}

	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}

	public void setUpdateShoppingCartButton(WebElement updateShoppingCartButton) {
		this.updateShoppingCartButton = updateShoppingCartButton;
	}
	
	//continue shopping button
	@FindBy(xpath = "//input[@name='continueshopping']")
	private WebElement continueShoppinButton;
	
	public void clickContinueShoppinButton() {
		continueShoppinButton.click();
	}

	public WebElement getContinueShoppinButton() {
		return continueShoppinButton;
	}

	public void setContinueShoppinButton(WebElement continueShoppinButton) {
		this.continueShoppinButton = continueShoppinButton;
	}
	
	//Product Name verification
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[3]/a[@class='product-name']")
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
	
	//Product price verification
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[4]/span[@class='product-unit-price']")
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

	//Product quantity verification
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[5]/input[@class='qty-input']")
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

	//Total price verification
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[6]/span[@class='product-subtotal']")
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
	
	//Discount code text field
	@FindBy(xpath = "//input[@name='discountcouponcode']")
	private WebElement discountCodeTextField;
	
	public void enterDiscountCode(String code) {
		discountCodeTextField.sendKeys(code);
	}

	public WebElement getDiscountCodeTextField() {
		return discountCodeTextField;
	}

	public void setDiscountCodeTextField(WebElement discountCodeTextField) {
		this.discountCodeTextField = discountCodeTextField;
	}
	
	//Apply coupon button
	@FindBy(xpath = "//input[@name='applydiscountcouponcode']")
	private WebElement applyCouponButton;
	
	public void clickApplyCouponButton() {
		applyCouponButton.click();
	}

	public WebElement getApplyCouponButton() {
		return applyCouponButton;
	}

	public void setApplyCouponButton(WebElement applyCouponButton) {
		this.applyCouponButton = applyCouponButton;
	}
	
	//Gift cards text field
	@FindBy(xpath = "//input[@name='giftcardcouponcode']")
	private WebElement giftCardsTextField;
	
	public void enterGiftCards(String giftCard) {
		giftCardsTextField.sendKeys(giftCard);
	}

	public WebElement getGiftCardsTextField() {
		return giftCardsTextField;
	}

	public void setGiftCardsTextField(WebElement giftCardsTextField) {
		this.giftCardsTextField = giftCardsTextField;
	}
	
	//Add gift card button
	@FindBy(xpath = "//input[@name='giftcardcouponcode']")
	private WebElement addGiftCardButton;
	
	public void clickAddGiftCardButton() {
		addGiftCardButton.click();
	}

	public WebElement getAddGiftCardButton() {
		return addGiftCardButton;
	}

	public void setAddGiftCardButton(WebElement addGiftCardButton) {
		this.addGiftCardButton = addGiftCardButton;
	}
	
	// country drop down
	@FindBy(xpath = "//select[@id='CountryId']")
	private WebElement selectCountryDropdown;

	public WebElement getSelectCountryDropdown() {
		return selectCountryDropdown;
	}

	public void setSelectCountryDropdown(WebElement selectCountryDropdown) {
		this.selectCountryDropdown = selectCountryDropdown;
	}
	
	//State/Province drop down
	@FindBy(xpath = "//select[@id='StateProvinceId']")
	private WebElement state_PovinceDropdown;
	
	public WebElement getState_PovinceDropdown() {
		return state_PovinceDropdown;
	}

	public void setState_PovinceDropdown(WebElement state_PovinceDropdown) {
		this.state_PovinceDropdown = state_PovinceDropdown;
	}

	//Zip/Postal code text field
	@FindBy(xpath = "//input[@id='ZipPostalCode']")
	private WebElement zip_PostalCodeTextField;
	
	public void EnterZip_PostalCodeTextField(String zipCode) {
		zip_PostalCodeTextField.sendKeys(zipCode);
	}
	
	public WebElement getZip_PostalCodeTextField() {
		return zip_PostalCodeTextField;
	}

	public void setZip_PostalCodeTextField(WebElement zip_PostalCodeTextField) {
		this.zip_PostalCodeTextField = zip_PostalCodeTextField;
	}

	//Estimate shipping button
	@FindBy(xpath = "//input[@name='estimateshipping']")
	private WebElement estimateShippingButton;
	
	public void clickEstimateShippingButton() {
		estimateShippingButton.click();
	}

	public WebElement getEstimateShippingButton() {
		return estimateShippingButton;
	}

	public void setEstimateShippingButton(WebElement estimateShippingButton) {
		this.estimateShippingButton = estimateShippingButton;
	}
	
	//Terms of service check box
	@FindBy(id = "termsofservice")
	private WebElement termsOfServiceCheckBox;
	
	public void clickTermsOfServiceCheckBox() {
		termsOfServiceCheckBox.click();
	}

	public WebElement getTermsOfServiceCheckBox() {
		return termsOfServiceCheckBox;
	}

	public void setTermsOfServiceCheckBox(WebElement termsOfServiceCheckBox) {
		this.termsOfServiceCheckBox = termsOfServiceCheckBox;
	}
	
	//Read terms and conditions link
	@FindBy(xpath = "//span[@class='read']")
	private WebElement readTermsAndConditionsLink;
	
	public void clickReadTermsAndConditionsLink() {
		readTermsAndConditionsLink.click();
	}
	
	public WebElement getReadTermsAndConditionsLink() {
		return readTermsAndConditionsLink;
	}

	public void setReadTermsAndConditionsLink(WebElement readTermsAndConditionsLink) {
		this.readTermsAndConditionsLink = readTermsAndConditionsLink;
	}

	//check out button
	@FindBy(css = "[id='checkout']")
	private WebElement checkoutButton;
	
	public void clickCheckoutButton() {
		checkoutButton.click();
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public void setCheckoutButton(WebElement checkoutButton) {
		this.checkoutButton = checkoutButton;
	}
}
