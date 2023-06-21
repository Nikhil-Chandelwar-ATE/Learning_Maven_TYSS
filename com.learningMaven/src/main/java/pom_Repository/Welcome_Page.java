package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {

	public Welcome_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	//Register link
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;

	public void clickRegister() {
		registerLink.click();
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	//Login link
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;

	public void clickLogin() {
		loginLink.click();
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	//Shopping Cart link
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcartLink;

	public void clickShoppingCart() {
		shoppingcartLink.click();
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public void setShoppingcartLink(WebElement shoppingcartLink) {
		this.shoppingcartLink = shoppingcartLink;
	}

	//Wishlist link
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistLink;

	public void clickWishlist() {
		wishlistLink.click();
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public void setWishlistLink(WebElement wishlistLink) {
		this.wishlistLink = wishlistLink;
	}

	//Search text field
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;

	public void searchtextField(String searchData) {
		searchBox.sendKeys(searchData);
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}

	//Search button
	@FindBy(xpath = "//input[@class='button-1 search-box-button']")
	private WebElement searchButton;

	public void clickSearchButton() {
		searchButton.click();
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	//Header Books link
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;

	public void clickBooksLink() {
		booksLink.click();
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public void setBooksLink(WebElement booksLink) {
		this.booksLink = booksLink;
	}

	//Header computers link
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;

	public void clickComputersLink() {
		computersLink.click();
	}

	public WebElement getComputersLink() {
		return booksLink;
	}

	public void setComputersLink(WebElement computersLink) {
		this.computersLink = computersLink;
	}

	//Header computers link
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;

	public void clickElectronicsLink() {
		electronicsLink.click();
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public void setElectronicsLink(WebElement electronicsLink) {
		this.electronicsLink = electronicsLink;
	}

	//Header apparel and shoes link
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelAndShoesLink;

	public void clickApparelAndShoesLink() {
		apparelAndShoesLink.click();
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public void setApparelAndShoesLink(WebElement apparelAndShoesLink) {
		this.apparelAndShoesLink = apparelAndShoesLink;
	}

	//Header digital downloads link
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloadsLink;

	public void clickDigitalDownloadsLink() {
		digitalDownloadsLink.click();
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public void setDigitalDownloadsLink(WebElement digitalDownloadsLink) {
		this.digitalDownloadsLink = digitalDownloadsLink;
	}

	//Header jewelry link
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;

	public void clickJewelryLink() {
		jewelryLink.click();
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public void setJewelryLink(WebElement jewelryLink) {
		this.jewelryLink = jewelryLink;
	}

	//Header Gift cards lik
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCardsLink;

	public void clickGiftCardsLink() {
		giftCardsLink.click();
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public void setGiftCardsLink(WebElement giftCardsLink) {
		this.giftCardsLink = giftCardsLink;
	}

	@FindBy(xpath = "//input[@id='newsletter-email']")
	private WebElement newsletterSignupTextField;

	public void enterNewsletterSignupTextField(String emailId) {
		newsletterSignupTextField.sendKeys(emailId);
	}

	public WebElement getNewsletterSignupTextField() {
		return newsletterSignupTextField;
	}

	public void setNewsletterSignupTextField(WebElement newsletterSignupTextField) {
		this.newsletterSignupTextField = newsletterSignupTextField;
	}

	@FindBy(xpath = "//input[@id='newsletter-subscribe-button']")
	private WebElement subscribeToNewsletterButton;

	public void clickSubscribeToNewsletterButton() {
		subscribeToNewsletterButton.click();
	}

	public WebElement getSubscribeToNewsletterButton() {
		return subscribeToNewsletterButton;
	}

	public void setSubscribeToNewsletterButton(WebElement subscribeToNewsletterButton) {
		this.subscribeToNewsletterButton = subscribeToNewsletterButton;
	}

	@FindBy(xpath = "//input[@id='pollanswers-1']")
	private WebElement excellentRadioButton;

	public void clickExcellentRadioButton() {
		excellentRadioButton.click();
	}

	public WebElement getExcellentRadioButton() {
		return excellentRadioButton;
	}

	public void setExcellentRadioButton(WebElement excellentRadioButton) {
		this.excellentRadioButton = excellentRadioButton;
	}

	@FindBy(xpath = "//input[@id='pollanswers-2']")
	private WebElement goodRadioButton;

	public void clickGoodRadioButton() {
		goodRadioButton.click();
	}

	public WebElement getGoodRadioButton() {
		return goodRadioButton;
	}

	public void setGoodRadioButton(WebElement goodRadioButton) {
		this.goodRadioButton = goodRadioButton;
	}

	@FindBy(xpath = "//input[@id='pollanswers-3']")
	private WebElement poorRadioButton;

	public void clickPoorRadioButton() {
		poorRadioButton.click();
	}

	public WebElement getPoorRadioButton() {
		return poorRadioButton;
	}

	public void setPoorRadioButton(WebElement poorRadioButton) {
		this.poorRadioButton = poorRadioButton;
	}

	@FindBy(xpath = "//input[@id='pollanswers-4']")
	private WebElement veryBadRadioButton;

	public void clickVeryBadRadioButton() {
		veryBadRadioButton.click();
	}

	public WebElement getVeryBadRadioButton() {
		return veryBadRadioButton;
	}

	public void setVeryBadRadioButton(WebElement veryBadRadioButton) {
		this.veryBadRadioButton = veryBadRadioButton;
	}

	@FindBy(xpath = "//input[@id='vote-poll-1']")
	private WebElement voteButton;

	public void clickVoteButton() {
		voteButton.click();
	}

	public WebElement getVoteButton() {
		return voteButton;
	}

	public void setVoteButton(WebElement voteButton) {
		this.voteButton = voteButton;
	}

	@FindBy(xpath = "//strong[text()='Manufacturers']/../..//a")
	private WebElement manufacturersLink;

	public void clickManufacturersLink() {
		manufacturersLink.click();
	}

	public WebElement getManufacturersLink() {
		return manufacturersLink;
	}

	public void setManufacturersLink(WebElement manufacturersLink) {
		this.manufacturersLink = manufacturersLink;
	}

	@FindBy(partialLinkText = "Books")
	private WebElement bodyBooksLink;

	public void clickBodyBooksLink() {
		bodyBooksLink.click();
	}

	public WebElement getBodyBooksLink() {
		return bodyBooksLink;
	}

	public void setBodyBooksLink(WebElement bodyBooksLink) {
		this.bodyBooksLink = bodyBooksLink;
	}

	@FindBy(partialLinkText = "Computers")
	private WebElement bodyComputersLink;

	public void clickBodyComputerLinks() {
		bodyBooksLink.click();
	}

	public WebElement getBodyComputersLink() {
		return bodyComputersLink;
	}

	public void setBodyComputersLink(WebElement bodyComputersLink) {
		this.bodyComputersLink = bodyComputersLink;
	}

	@FindBy(partialLinkText = "Electronics")
	private WebElement bodyElectronicsLink;

	public void clickbodyElectronicsLinks() {
		bodyElectronicsLink.click();
	}

	public WebElement getBodyElectronicsLink() {
		return bodyElectronicsLink;
	}

	public void setBodyElectronicsLink(WebElement bodyElectronicsLink) {
		this.bodyElectronicsLink = bodyElectronicsLink;
	}

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement bodyApparelShoesLink;

	public void clickBodyApparelShoesLink() {
		bodyApparelShoesLink.click();
	}

	public WebElement getBodyApparelShoesLink() {
		return bodyApparelShoesLink;
	}

	public void setBodyApparelShoesLink(WebElement bodyApparelShoesLink) {
		this.bodyApparelShoesLink = bodyApparelShoesLink;
	}

	@FindBy(partialLinkText = "Digital downloads")
	private WebElement bodyDigitalDownloadsLink;

	public void clickBodyDigitalDownloadsLink() {
		bodyDigitalDownloadsLink.click();
	}

	public WebElement getBodyDigitalDownloadsLink() {
		return bodyDigitalDownloadsLink;
	}

	public void setBodyDigitalDownloadsLink(WebElement bodyDigitalDownloadsLink) {
		this.bodyDigitalDownloadsLink = bodyDigitalDownloadsLink;
	}

	@FindBy(partialLinkText = "Jewelry")
	private WebElement bodyJewelryLink;

	public void clickbodyJewelryLink() {
		bodyJewelryLink.click();
	}

	public WebElement getBodyJewelryLink() {
		return bodyJewelryLink;
	}

	public void setBodyJewelryLink(WebElement bodyJewelryLink) {
		this.bodyJewelryLink = bodyJewelryLink;
	}

	@FindBy(partialLinkText = "Gift Cards")
	private WebElement bodyGiftCardsLink;

	public void clickBodyGiftCardsLink() {
		bodyGiftCardsLink.click();
	}

	public WebElement getBodyGiftCardsLink() {
		return bodyGiftCardsLink;
	}

	public void setBodyGiftCardsLink(WebElement bodyGiftCardsLink) {
		this.bodyGiftCardsLink = bodyGiftCardsLink;
	}

	@FindBy(xpath = "//strong[text()='Recently viewed products']/../..//li")
	private WebElement recentlyViewedProductLink;
	
	public void clickRecentlyViewedProductLink() {
		recentlyViewedProductLink.click();
	}

	public WebElement getRecentlyViewedProductLink() {
		return recentlyViewedProductLink;
	}

	public void setRecentlyViewedProductLink(WebElement recentlyViewedProductLink) {
		this.recentlyViewedProductLink = recentlyViewedProductLink;
	}
}
