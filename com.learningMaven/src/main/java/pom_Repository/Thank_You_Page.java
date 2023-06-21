package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thank_You_Page {

	public Thank_You_Page(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Click here for order details.']")
	private WebElement orderDetailsLink;
	
	public void clickOrderDetailsLink() {
		orderDetailsLink.click();
	}

	public WebElement getOrderDetailsLink() {
		return orderDetailsLink;
	}

	public void setOrderDetailsLink(WebElement orderDetailsLink) {
		this.orderDetailsLink = orderDetailsLink;
	}
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	public void clickContinueButton() {
		continueButton.click();
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(WebElement continueButton) {
		this.continueButton = continueButton;
	}
	
}
